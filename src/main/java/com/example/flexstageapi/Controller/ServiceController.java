package com.example.flexstageapi.Controller;

import com.example.flexstageapi.Entities.ServiceEntity;
import com.example.flexstageapi.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceController {

    @Autowired
    public ServiceRepository serviceRepository;

    @GetMapping(value = "/getAll",headers = "Accept=application/json")
    private @ResponseBody
    ResponseEntity<Iterable<ServiceEntity>> getAllService () {
        try {
            Iterable<ServiceEntity> services = new ArrayList<>();
            services = serviceRepository.findAll();
            return new ResponseEntity<>(services, HttpStatus.OK);
        } catch (Exception exception) {
            throw new IllegalStateException(exception) ;
        }
    }
}
