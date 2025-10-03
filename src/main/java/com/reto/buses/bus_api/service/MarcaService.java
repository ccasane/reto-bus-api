package com.reto.buses.bus_api.service;

import com.reto.buses.bus_api.model.Marca;
import com.reto.buses.bus_api.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> getMarcaById(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca saveMarca(Marca marca) {
        return marcaRepository.save(marca);
    }
}
