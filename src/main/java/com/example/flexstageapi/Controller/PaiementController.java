package com.example.flexstageapi.Controller;

import com.example.flexstageapi.Entities.PaiementEntity;
import com.example.flexstageapi.Repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Paiement")
public class PaiementController {
    @Autowired
    public PaiementRepository paiementRepository;

    public List<PaiementEntity> getPaiement(){
        return (List<PaiementEntity>) paiementRepository.findAll();
    }

    @GetMapping(path = "paiementById/{id}")
    public PaiementEntity voirPaiement(@PathVariable Integer id)
    {
        return getPaiement()
                .stream()
                .filter(element->element.getId() == id)
                .findFirst()
                .orElseThrow();
    }
//    @PostMapping(path = "/payer/")
//    public
}
