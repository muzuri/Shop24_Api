package com.bk.coding.exercises.shop24.reposotories;

import com.bk.coding.exercises.shop24.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CargoRepo extends JpaRepository<Cargo, Long> {
    Cargo findByCargoId(UUID clientUuid);
}
