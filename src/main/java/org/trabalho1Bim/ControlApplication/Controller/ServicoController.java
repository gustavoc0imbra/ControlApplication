package org.trabalho1Bim.ControlApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.trabalho1Bim.ControlApplication.Model.Servico;
import org.trabalho1Bim.ControlApplication.Service.ServicoService;

import java.util.List;
import java.util.Optional;

@RestController
public class ServicoController {
    @Autowired
    private ServicoService servicoService;

    private static final String ENDPOINT = "/api/servico";

    @GetMapping(ENDPOINT)
    public List<Servico> findAll()
    {
        return servicoService.findAll();
    }

    @PostMapping(ENDPOINT)
    public Servico add(@RequestBody Servico servico)
    {
        return servicoService.add(servico);
    }

    @GetMapping(ENDPOINT+"/{id}/")
    public Optional<Servico> findOne(@PathVariable("id") Long id)
    {
        return servicoService.findOne(id);
    }

    
}
