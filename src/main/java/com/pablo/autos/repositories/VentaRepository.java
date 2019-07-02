package com.pablo.autos.repositories;

import com.pablo.autos.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
    Venta findById(int id);
}
