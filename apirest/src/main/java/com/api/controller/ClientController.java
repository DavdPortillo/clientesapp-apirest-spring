package com.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Client;
import com.api.service.IClientService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/client")
public class ClientController {
    
    @Autowired
    private IClientService clientService;
    
    @GetMapping
    public List <Client> getClients(){
	return clientService.findAll();
    }
    
    @GetMapping("{id}")
    public Client getById(@PathVariable("id") Long id) {
	return clientService.findById(id);
	
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client saveClient(@RequestBody Client client) {
	clientService.addClient(client);
	return client;
    }
    
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Client editeAlbum(@RequestBody Client client) {
	return clientService.addClient(client);
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAlbum(@PathVariable("id") long id) {
	clientService.deleteClient(id);
    }

}
