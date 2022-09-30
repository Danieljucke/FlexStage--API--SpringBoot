package com.example.flexstageapi.Repository;


import com.example.flexstageapi.Entities.ServiceEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<ServiceEntity,Integer> {
}
