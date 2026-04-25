package com.automotivo.controller;

import com.automotivo.model.Modelo;
import com.automotivo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
@CrossOrigin("*")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;

    // LISTAR MODELOS (ESSENCIAL PRO FRONT)
    @GetMapping
    public List<Modelo> listar() {
        return modeloRepository.findAll();
    }

    // CRIAR MODELO
    @PostMapping
    public Modelo criar(@RequestBody Modelo modelo) {
        return modeloRepository.save(modelo);
    }
}