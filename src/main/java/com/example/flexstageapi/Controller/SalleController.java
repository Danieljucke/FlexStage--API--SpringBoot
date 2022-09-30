package com.example.flexstageapi.Controller;

import com.example.flexstageapi.Entities.SalleEntity;
import com.example.flexstageapi.Repository.SalleRepository;
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
@RequestMapping(path ="/Salle")
public class SalleController {

    @Autowired
    public SalleRepository salleRepository;

    public List<SalleEntity> getRoom(){
        return (List<SalleEntity>)salleRepository.findAll();
    }
    @GetMapping(path = "/ShowAll")
    ResponseEntity <Iterable<SalleEntity>> getAllRoom (){
        try {
            Iterable<SalleEntity> salles =new ArrayList<>();
            salles=salleRepository.findAll();
            return new ResponseEntity<>(salles, HttpStatus.OK);
        }catch (Exception exception)
        {
            throw new IllegalStateException(""+exception);
        }
    }
    @GetMapping(path = "/getSalle/{id}")
    public SalleEntity showSalleById(@PathVariable("id") Integer id){
        return getRoom()
                .stream()
                .filter(element->element.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
