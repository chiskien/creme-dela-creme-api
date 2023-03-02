package com.example.mynetflixapi.repositories;

import com.example.mynetflixapi.models.Actor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    @Query
    List<Actor> getAllActor();
}