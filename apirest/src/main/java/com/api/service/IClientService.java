package com.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.entity.Client;


@Service
public interface IClientService {

    void addClient(Client client);

    void deleteClient(Long id);

    List<Client> findAll();
    
    Client findById(Long id);

}
