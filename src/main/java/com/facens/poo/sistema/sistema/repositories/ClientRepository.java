package com.facens.poo.sistema.sistema.repositories;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo.sistema.sistema.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
