package com.pablo.autos.services;

import com.pablo.autos.model.Cliente;
import com.pablo.autos.model.Vehiculo;
import com.pablo.autos.repositories.ClienteRepository;
import com.pablo.autos.repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppService {

    private final VehiculoRepository vehiculoRepository;
    private final ClienteRepository clienteRepository;

    public AppService(VehiculoRepository vehiculoRepository, ClienteRepository clienteRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.clienteRepository = clienteRepository;
    }

    @RequestMapping("/vehiculo/{vin}")
    @ResponseBody
    public Vehiculo getVehiculo(@PathVariable("vin") String vin){
        return vehiculoRepository.findById(vin)
                .orElseThrow(() -> new IllegalArgumentException("VIN inválido:" + vin));
    }

    @RequestMapping("/cliente/{rut}")
    @ResponseBody
    public Cliente getCliente(@PathVariable("rut") String rut){
        return clienteRepository.findById(rut)
                .orElseThrow(() -> new IllegalArgumentException("VIN inválido:" + rut));
    }

}
