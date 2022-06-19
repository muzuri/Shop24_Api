package com.bk.coding.exercises.shop24.services;

import com.bk.coding.exercises.shop24.models.Client;
import com.bk.coding.exercises.shop24.reposotories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class ClientService {
    @Autowired
    ClientRepo clientRepo;

    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }

    public Client findClient(UUID clientUuid) {
        return clientRepo.findByClientUuid(clientUuid);
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }
}
