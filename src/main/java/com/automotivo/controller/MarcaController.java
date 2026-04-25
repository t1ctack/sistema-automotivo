package com.automotivo.controller;

import com.automotivo.model.Marca;
import com.automotivo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@CrossOrigin("*")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    // LISTAR TODAS AS MARCAS
    @GetMapping
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    // CRIAR NOVA MARCA
    @PostMapping
    public Marca criar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }
}