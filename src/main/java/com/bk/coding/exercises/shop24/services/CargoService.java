package com.bk.coding.exercises.shop24.services;

import com.bk.coding.exercises.shop24.models.Cargo;
import com.bk.coding.exercises.shop24.reposotories.CargoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CargoService {
    @Autowired
    CargoRepo cargoRepo;

    public Cargo saveCargo(Cargo cargo) {
        cargo.setCargoId(UUID.randomUUID());
        cargo.setInsertDate(new Date());
        return cargoRepo.save(cargo);
    }

    public Cargo findCargo(UUID cargoId) {
        return cargoRepo.findByCargoId(cargoId);
    }

    public List<Cargo> findAll() {
        return cargoRepo.findAll();
    }
}