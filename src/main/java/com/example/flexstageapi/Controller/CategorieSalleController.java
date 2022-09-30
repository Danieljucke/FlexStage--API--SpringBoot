package com.example.flexstageapi.Controller;

import com.example.flexstageapi.Entities.CategorieSalleEntity;
import com.example.flexstageapi.Repository.CategorieSalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/CategorySalle")
public class CategorieSalleController {


    @Autowired
    public CategorieSalleRepository categorieSalleRepository;

    public List<CategorieSalleEntity> getCategories(){
        return (List<CategorieSalleEntity>) categorieSalleRepository.findAll();
    }
    @GetMapping(path = "/showAll")
    ResponseEntity <Iterable<CategorieSalleEntity>> showAll()
    {
        try
        {
            Iterable<CategorieSalleEntity> categorieSalles= new ArrayList<>();
            categorieSalles=categorieSalleRepository.findAll();
            return new ResponseEntity<>(categorieSalles, HttpStatus.OK);

        }catch (Exception e) {
            throw new IllegalStateException(""+e);
        }
    }
    @GetMapping(path = "/ShowCategorie/{id}")
    public CategorieSalleEntity showCategoryById(@PathVariable Integer id)
    {
        return getCategories()
                .stream()
                .filter(element->element.getId() == id)
                .findFirst()
                .orElseThrow();
    }

}
