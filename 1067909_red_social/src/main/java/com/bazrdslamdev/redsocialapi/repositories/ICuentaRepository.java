package com.bazrdslamdev.redsocialapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazrdslamdev.redsocialapi.models.Cuenta;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta, String>{

}
