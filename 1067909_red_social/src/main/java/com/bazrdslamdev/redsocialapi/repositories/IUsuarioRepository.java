package com.bazrdslamdev.redsocialapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazrdslamdev.redsocialapi.models.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, String> {

}
