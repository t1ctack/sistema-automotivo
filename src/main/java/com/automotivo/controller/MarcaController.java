package com.automotivo.controller;

import com.automotivo.model.Marca;
import com.automotivo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaService service;

    @GetMapping
    public List<Marca> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return service.salvar(marca);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}