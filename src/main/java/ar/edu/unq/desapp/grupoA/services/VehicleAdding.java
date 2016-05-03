package ar.edu.unq.desapp.grupoA.services;

import ar.edu.unq.desapp.grupoA.models.UserModel;
import ar.edu.unq.desapp.grupoA.models.Vehicle;
import ar.edu.unq.desapp.grupoA.repositories.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("vehicleAdding")
public class VehicleAdding {

    private VehicleRepository repository;

    @Transactional
    public void createVehicle(UserModel user, String brand, int capacity) {
        Vehicle vehicle = new Vehicle(brand, capacity, user);
        user.setVehicle(vehicle);
    }
}
