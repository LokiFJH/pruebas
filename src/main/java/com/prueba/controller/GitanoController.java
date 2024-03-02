package com.prueba.controller;

import com.prueba.model.Gitano;
import com.prueba.service.GitanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gitano")
public class GitanoController {

    @Autowired
    private GitanoService gitanoService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Gitano> getAllGitano() {
        return gitanoService.getAllGitano();
    }

    @GetMapping("/{id}")
    public Optional<Gitano> getGitanoById(@PathVariable Long id) {
        return gitanoService.getGitanoById(id);
    }

    @PostMapping("/")
    public Gitano saveGitano(@RequestBody Gitano gitano) {
        return gitanoService.saveGitano(gitano);
    }

    @DeleteMapping("/{id}")
    public void deleteGitano(@PathVariable Long id) {
        gitanoService.deleteGitano(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gitano> updateGitano(@PathVariable Long id, @RequestBody Gitano updatedGitano) {
        Gitano updatedEntity = gitanoService.updateGitano(id, updatedGitano);
        if (updatedEntity != null) {
            return ResponseEntity.ok(updatedEntity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
