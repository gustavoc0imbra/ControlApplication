package org.trabalho1Bim.ControlApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho1Bim.ControlApplication.Model.Vehicle;
import org.trabalho1Bim.ControlApplication.Repository.VehicleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle add(Vehicle vehicle)
    {
        return vehicleRepository.saveAndFlush(vehicle);
    }

    public List<Vehicle> findAll()
    {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> findOne(String licensePlate)
    {
        return vehicleRepository.findById(licensePlate);
    }

    public void delete (String licensePlate)
    {
        vehicleRepository.deleteById(licensePlate);
    }
}
