package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Client;
import com.api.repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional
    public void addClient(Client client) {
	clientRepository.save(client);
    }

    @Override
    @Transactional
    public void deleteClient(Long id) {
	clientRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Client> findAll() {
	return clientRepository.findAll();
    }

    @Override
    @Transactional
    public Client findById(Long id) {
	return clientRepository.findById(id).orElse(null);
    }
}
