package org.trabalho1Bim.ControlApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho1Bim.ControlApplication.Model.MonthAccount;
import org.trabalho1Bim.ControlApplication.Repository.MonthAccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MonthAccountService {

    @Autowired
    private MonthAccountRepository monthAccountRepository;

    public MonthAccount add(MonthAccount monthAccount)
    {
        return monthAccountRepository.saveAndFlush(monthAccount);
    }

    public List<MonthAccount> findAll()
    {
        return monthAccountRepository.findAll();
    }

    public Optional<MonthAccount> findOne(Long id)
    {
        return monthAccountRepository.findById(id);
    }

    public void delete(Long id)
    {
        monthAccountRepository.deleteById(id);
    }
}