package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Client;



public interface ClientRepository extends JpaRepository<Client, Long>{

}
