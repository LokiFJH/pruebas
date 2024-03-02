package com.prueba.repository;

import com.prueba.model.Gitano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitanoRepository extends JpaRepository<Gitano, Long> {

}
