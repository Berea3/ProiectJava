package org.back.controllers;

import org.back.entities.Masina;
import org.back.repositories.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/masina")
public class MasinaController {

    @Autowired
    MasinaRepository masinaRepository;

    @PostMapping(path="/create")
    public void create(@RequestBody Masina masina)
    {
        masinaRepository.save(masina);
    }

    @GetMapping(path="/getAll")
    public List<Masina> getAll()
    {
        return masinaRepository.findAll();
    }
}
