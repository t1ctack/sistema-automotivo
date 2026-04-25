package com.automotivo.service;

import com.automotivo.model.Modelo;
import com.automotivo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository repository;

    public List<Modelo> listarTodos() {
        return repository.findAll();
    }

    public Modelo salvar(Modelo modelo) {
        return repository.save(modelo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}