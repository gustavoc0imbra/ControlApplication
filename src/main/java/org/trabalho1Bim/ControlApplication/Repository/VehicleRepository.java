package org.trabalho1Bim.ControlApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.trabalho1Bim.ControlApplication.Model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
}
