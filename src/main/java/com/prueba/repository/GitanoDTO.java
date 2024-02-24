package com.prueba.repository;

import com.prueba.model.Gitano;
import org.springframework.stereotype.Repository;

@Repository
public class GitanoDTO {

    public Gitano getGitanoByApellido(String apellido){
        //Buscar por ese appellido

        //Obtenemos el objeto (base de datos)
        Gitano newGit = new Gitano();
        newGit.setNombre("Paco");
        newGit.setDelitos(232);
        return newGit;
    }
}
