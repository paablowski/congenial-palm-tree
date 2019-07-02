package com.pablo.autos.repositories;

import com.pablo.autos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Cliente findByRut(String rut);
}
