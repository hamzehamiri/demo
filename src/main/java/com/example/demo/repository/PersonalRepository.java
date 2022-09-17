package com.example.demo.repository;

import com.example.demo.entities.Personal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends CrudRepository<Personal, Long> {
    @Query("select p.name from Personal p where p.name like :personName")
    public String findByName(String personName);
}
