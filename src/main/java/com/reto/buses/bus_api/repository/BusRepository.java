package com.reto.buses.bus_api.repository;

import com.reto.buses.bus_api.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
