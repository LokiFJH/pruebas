package com.prueba.service;


import com.prueba.model.Gitano;
import com.prueba.repository.GitanoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitanoService {

    @Autowired
    GitanoDTO gitanoDTO;

    public Gitano getGitanoApellido(){
        Gitano respuesta = gitanoDTO.getGitanoByApellido("Apellido del gitano");
        if(respuesta==null){
            return null;
        }
        return respuesta;
    }
}
