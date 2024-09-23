package org.trabalho1Bim.ControlApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.trabalho1Bim.ControlApplication.Model.Employee;
import org.trabalho1Bim.ControlApplication.Service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public ModelAndView index()
    {
        ModelAndView mv = new ModelAndView("/employee");
        mv.addObject("employees", employeeService.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Employee employee)
    {
        ModelAndView mv = new ModelAndView("/employeeadd");
        mv.addObject("employee", employee);

        return mv;
    }

    @GetMapping("/edit/{cpf}")
    public ModelAndView edit(@PathVariable("cpf") String cpf)
    {

        return add(employeeService.findOne(cpf).get());
    }

    @GetMapping("/delete/{cpf}")
    public ModelAndView delete(@PathVariable("cpf") String cpf) {

        employeeService.delete(cpf);

        return index();
    }

    @PostMapping("/save")
    public ModelAndView save(Employee employee, BindingResult result)
    {
        if(result.hasErrors())
        {
            return add(employee);
        }

        employeeService.add(employee);

        return index();
    }

}
