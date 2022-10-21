package com.bazrdslamdev.redsocialapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazrdslamdev.redsocialapi.models.Publicacion;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Long> {

}
