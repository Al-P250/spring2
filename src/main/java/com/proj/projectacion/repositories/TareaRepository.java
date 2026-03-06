package com.proj.projectacion.repositories;


import com.proj.projectacion.models.TareaModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tareas", path = "tareas")
public interface TareaRepository extends MongoRepository<TareaModel, String> {
}
