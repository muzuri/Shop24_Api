package com.bk.coding.exercises.shop24.controllers;

import com.bk.coding.exercises.shop24.models.Cargo;
import com.bk.coding.exercises.shop24.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("cargo")
public class CargoResource {

    @Autowired
    CargoService cargoService;

    //     Get a list of all cargo companies
    @GetMapping("/all")
    public ResponseEntity<List<Cargo>> getAllCargo() {
        List<Cargo> cargo = cargoService.findAll();
        return new ResponseEntity<>(cargo, HttpStatus.OK);
    }

    //    Get a specific cargo company by ID
    @GetMapping("/{cargoId}")
    public ResponseEntity<Cargo> getClient(@PathVariable("cargoId") UUID cargoId) {
        System.out.println("find cargo by cargoId .............:" + cargoId);
        Cargo cargo = cargoService.findCargo(cargoId);
        return new ResponseEntity<>(cargo, HttpStatus.OK);
    }


    @PostMapping("/save")
    public Cargo saveCargo(@RequestBody Cargo cargo) {

        return cargoService.saveCargo(cargo);
    }

}
