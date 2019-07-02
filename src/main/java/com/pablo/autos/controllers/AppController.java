package com.pablo.autos.controllers;

import com.pablo.autos.model.*;

import com.pablo.autos.repositories.ClienteRepository;
import com.pablo.autos.repositories.VehiculoRepository;
import com.pablo.autos.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AppController {

    private final VehiculoRepository vehiculoRepository;
    private final ClienteRepository clienteRepository;
    private final VentaRepository ventaRepository;


    @Autowired
    public AppController(VehiculoRepository vehiculoRepository, ClienteRepository clienteRepository, VentaRepository ventaRepository){
        this.vehiculoRepository = vehiculoRepository;
        this.clienteRepository = clienteRepository;
        this.ventaRepository = ventaRepository;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/stock")
    public String stockVehiculos(Model model){
        model.addAttribute("vehiculos", vehiculoRepository.findAll());
        return "stock";
    }


    @GetMapping("/clientes")
    public String clientesRegistrados(Model model){
        model.addAttribute("clientes", clienteRepository.findAll());
        return "ver-clientes";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Cliente cliente){
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid Cliente cliente, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-user";
        }

        clienteRepository.save(cliente);
        model.addAttribute("clientes", clienteRepository.findAll());
        return "ver-clientes";
    }

    @GetMapping("/edit/{rut}")
    public String showUpdateForm(@PathVariable("rut") String rut, Model model){
        Cliente cliente = clienteRepository.findById(rut).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + rut));
        model.addAttribute("cliente", cliente);
        return "update-user";

    }

    @GetMapping("/material")
    public String getMaterial(){
        return "material";
    }

    @PostMapping("/update/{rut}")
    public String updateUser(@PathVariable("rut") String rut, @Valid Cliente cliente, BindingResult result, Model model){
        if (result.hasErrors()){
            cliente.setRut(rut);
            return "update-user";
        }

        clienteRepository.save(cliente);
        model.addAttribute("clientes", clienteRepository.findAll());
        return "ver-clientes";
    }

    @GetMapping("/delete/{rut}")
    public String deleteUser(@PathVariable("rut") String rut, Model model){
        Cliente cliente = clienteRepository.findById(rut).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + rut));
        clienteRepository.delete(cliente);
        model.addAttribute("clientes", clienteRepository.findAll());
        return "ver-clientes";
    }


    @GetMapping("/nuevaventa")
    public String nuevaVenta(Model model){

        List<Vehiculo> vehiculos  = vehiculoRepository.findAll();
        model.addAttribute("vehiculos", vehiculos);
        return "nueva-venta";
    }



    @GetMapping("/ventas")
    public String getVentas(Model model){
        model.addAttribute("ventas", ventaRepository.findAll());
        return "ventas";
    }


}
