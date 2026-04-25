package com.automotivo.service;

import com.automotivo.model.Veiculo;
import com.automotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // 🔍 FILTROS

    public List<Veiculo> buscarPorStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<Veiculo> buscarPorAno(int ano) {
        return repository.findByAno(ano);
    }

    public List<Veiculo> buscarPorPreco(double min, double max) {
        return repository.findByPrecoBetween(min, max);
    }

    public List<Veiculo> buscarPorModelo(String nome) {
        return repository.findByModeloNome(nome);
    }
}