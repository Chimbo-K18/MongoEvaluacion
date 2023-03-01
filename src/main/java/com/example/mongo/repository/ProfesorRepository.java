package com.example.mongo.repository;

import com.example.mongo.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProfesorRepository extends  MongoRepository<Profesor, Long>{
	
}
