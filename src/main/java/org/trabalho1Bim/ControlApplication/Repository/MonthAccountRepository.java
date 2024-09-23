package org.trabalho1Bim.ControlApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.trabalho1Bim.ControlApplication.Model.MonthAccount;

@Repository
public interface MonthAccountRepository extends JpaRepository<MonthAccount, Long> {
}
