package org.trabalho1Bim.ControlApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.trabalho1Bim.ControlApplication.Model.MonthAccount;
import org.trabalho1Bim.ControlApplication.Service.MonthAccountService;

import java.util.Date;

@Controller
public class MonthAccountController {
    @Autowired
    private MonthAccountService monthAccountService;

    @GetMapping("/contaDoMes")
    public ModelAndView index()
    {
        ModelAndView mv = new ModelAndView("/monthAccount");
        mv.addObject("monthaccounts", monthAccountService.findAll());

        return mv;
    }

    @GetMapping("/contaDoMes/add")
    public ModelAndView add(MonthAccount monthAccount)
    {
        ModelAndView mv = new ModelAndView("/monthaccountadd");
        mv.addObject("monthaccount", monthAccount);

        return mv;
    }

    @GetMapping("/contaDoMes/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id)
    {

        return add(monthAccountService.findOne(id).get());
    }

    @GetMapping("/contaDoMes/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        monthAccountService.delete(id);

        return index();
    }

    @PostMapping("/contaDoMes/save")
    public ModelAndView save(MonthAccount monthAccount, BindingResult result)
    {
        if(result.hasErrors())
        {
            return add(monthAccount);
        }

        monthAccount.setCreatedAt(new Date());

        monthAccountService.add(monthAccount);

        return index();
    }
}
