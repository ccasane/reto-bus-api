package com.reto.buses.bus_api.repository;

import com.reto.buses.bus_api.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    Optional<Marca> encontrarPorNombre(String nombre);
}