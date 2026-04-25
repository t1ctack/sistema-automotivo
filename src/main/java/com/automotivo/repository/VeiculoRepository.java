package com.automotivo.repository;

import com.automotivo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByStatus(String status);

    List<Veiculo> findByAno(int ano);

    List<Veiculo> findByPrecoBetween(double min, double max);

    List<Veiculo> findByModeloNome(String nome);
}