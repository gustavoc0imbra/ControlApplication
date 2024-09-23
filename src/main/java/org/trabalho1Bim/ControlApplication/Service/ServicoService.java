package org.trabalho1Bim.ControlApplication.Service;

import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho1Bim.ControlApplication.Model.Servico;
import org.trabalho1Bim.ControlApplication.Repository.ServicoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    public Servico add(Servico order)
    {
        return servicoRepository.saveAndFlush(order);
    }

    public List<Servico> findAll()
    {
        return servicoRepository.findAll();
    }

    public Optional<Servico> findOne(Long id)
    {
        return servicoRepository.findById(id);
    }

    public void delete (Long id)
    {
        servicoRepository.deleteById(id);
    }
}
