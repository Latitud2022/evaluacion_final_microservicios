package com.bazrdslamdev.redsocialapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazrdslamdev.redsocialapi.models.Megusta;

@Repository
public interface IMegustaRepository extends JpaRepository<Megusta, String> {

}
