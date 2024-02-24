package com.prueba.controller;

import com.prueba.model.Gitano;
import com.prueba.service.GitanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GitanoController {

    @Autowired
    GitanoService gitanoService;

    @GetMapping("/delitos")
    public int getGitanoDelitosPorApellido() {
        Gitano gitano = gitanoService.getGitanoApellido();
        return gitano.getDelitos();
    }

    @GetMapping("/nombre")
    public String getGitanoNombre() {
        Gitano gitano = gitanoService.getGitanoApellido();
        return gitano.getNombre();
    }

}
