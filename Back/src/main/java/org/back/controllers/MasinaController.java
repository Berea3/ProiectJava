package org.back.controllers;

import org.back.entities.Masina;
import org.back.repositories.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/masina")
public class MasinaController {

    @Autowired
    MasinaRepository masinaRepository;

    // CREATE
    @PostMapping(path="/create")
    public void create(@RequestBody Masina masina)
    {
        masinaRepository.save(masina);
    }

    //READ
    @GetMapping(path="/getAll")
    public List<Masina> getAll()
    {
        return masinaRepository.findAll();
    }

    @GetMapping(path="/getById/{id}")
    public Optional<Masina> getById(@PathVariable String id)
    {
        return masinaRepository.findById(id);
    }

    //UPDATE
    @PutMapping(path="/update")
    public void update(@RequestBody Masina masina)
    {
        masinaRepository.save(masina);
    }

    //DELETE
    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id)
    {
        masinaRepository.deleteById(id);
    }
}
