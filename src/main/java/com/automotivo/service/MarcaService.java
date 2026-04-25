package com.automotivo.service;

import com.automotivo.model.Marca;
import com.automotivo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository repository;

    public List<Marca> listarTodos() {
        return repository.findAll();
    }

    public Marca salvar(Marca marca) {
        return repository.save(marca);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}