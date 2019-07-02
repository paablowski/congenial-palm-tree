package com.pablo.autos.repositories;

import com.pablo.autos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
    Vehiculo findByVin(String vin);

}
