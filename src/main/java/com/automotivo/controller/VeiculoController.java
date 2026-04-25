package com.automotivo.controller;

import com.automotivo.model.Veiculo;
import com.automotivo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    // LISTAR TODOS
    @GetMapping
    public List<Veiculo> listar() {
        return service.listarTodos();
    }

    // CADASTRAR
    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return service.salvar(veiculo);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        veiculo.setId(id);
        return service.salvar(veiculo);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    // 🔍 FILTROS

    @GetMapping("/status")
    public List<Veiculo> buscarPorStatus(@RequestParam String status) {
        return service.buscarPorStatus(status);
    }

    @GetMapping("/ano")
    public List<Veiculo> buscarPorAno(@RequestParam int ano) {
        return service.buscarPorAno(ano);
    }

    @GetMapping("/preco")
    public List<Veiculo> buscarPorPreco(@RequestParam double min, @RequestParam double max) {
        return service.buscarPorPreco(min, max);
    }

    @GetMapping("/modelo")
    public List<Veiculo> buscarPorModelo(@RequestParam String nome) {
        return service.buscarPorModelo(nome);
    }
}