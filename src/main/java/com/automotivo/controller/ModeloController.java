package com.automotivo.controller;

import com.automotivo.model.Modelo;
import com.automotivo.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloService service;

    @GetMapping
    public List<Modelo> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Modelo salvar(@RequestBody Modelo modelo) {
        return service.salvar(modelo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}