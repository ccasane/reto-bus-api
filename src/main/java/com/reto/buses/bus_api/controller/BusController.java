package com.reto.buses.bus_api.controller;

import com.reto.buses.bus_api.model.Bus;
import com.reto.buses.bus_api.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping
    public ResponseEntity<Page<Bus>> getAllBuses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String dir) {

        Sort sort = Sort.by(Sort.Direction.fromString(dir), sortBy);
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        Page<Bus> buses = busService.getAllBuses(pageRequest);

        return ResponseEntity.ok(buses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
