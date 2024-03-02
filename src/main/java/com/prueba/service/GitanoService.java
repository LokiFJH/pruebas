package com.prueba.service;


import com.prueba.model.Gitano;
import com.prueba.repository.GitanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GitanoService {

    @Autowired
    private GitanoRepository gitanoRepository;

    public List<Gitano> getAllGitano() {
        return gitanoRepository.findAll();
    }

    public Optional<Gitano> getGitanoById(Long id) {
        return gitanoRepository.findById(id);
    }

    public Gitano saveGitano(Gitano gitano) {
        return gitanoRepository.save(gitano);
    }

    public void deleteGitano(Long id) {
        gitanoRepository.deleteById(id);
    }

    public Gitano updateGitano(Long id, Gitano updatedGitano) {
        Gitano existingGitano = gitanoRepository.findById(id).orElse(null);
        if (existingGitano != null) {
            // Update the fields of existingGitano with the values from updatedGitano
            existingGitano.setNombre(updatedGitano.getNombre());
            existingGitano.setApellido(updatedGitano.getApellido());
            existingGitano.setEdad(updatedGitano.getEdad());
            existingGitano.setHijos(updatedGitano.getHijos());
            existingGitano.setDelitos(updatedGitano.getDelitos());

            // Save the updated entity
            return gitanoRepository.save(existingGitano);
        }
        return null; // Or throw an exception if desired
    }
}
