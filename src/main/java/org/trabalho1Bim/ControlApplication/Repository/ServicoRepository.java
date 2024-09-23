package org.trabalho1Bim.ControlApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.trabalho1Bim.ControlApplication.Model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
