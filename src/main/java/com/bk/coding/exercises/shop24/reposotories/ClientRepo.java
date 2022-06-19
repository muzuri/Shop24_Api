package com.bk.coding.exercises.shop24.reposotories;

import com.bk.coding.exercises.shop24.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepo extends JpaRepository<Client,Long> {
    Client findByClientUuid(UUID clientUuid);
}
