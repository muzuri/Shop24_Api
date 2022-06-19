package com.bk.coding.exercises.shop24.controllers;

import com.bk.coding.exercises.shop24.models.Client;
import com.bk.coding.exercises.shop24.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("client")
public class ClientResource {
    @Autowired
    ClientService clientService;


    //    Get a specific client by ID
    @GetMapping("/{clientUuid}")
    public ResponseEntity<Client> getClient(@PathVariable("clientUuid") UUID clientUuid) {
        System.out.println("find client by client id.............:" + clientUuid);
        Client client = clientService.findClient(clientUuid);
        return new ResponseEntity<>(client, OK);
    }


    //     Get a list of all clients
    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> client = clientService.findAll();
        return new ResponseEntity<>(client, OK);
    }

    @PostMapping("/save")
    public Client saveClient(@RequestBody Client client) {
        client.setClientUuid(UUID.randomUUID());
        client.setInsertDate(new Date());
        return clientService.saveClient(client);
    }


}
