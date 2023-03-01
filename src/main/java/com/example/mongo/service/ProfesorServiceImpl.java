package com.example.mongo.service;

import com.example.mongo.model.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.mongo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorService{

	@Autowired
        ProfesorRepository profesorRepository;
    
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }  
	
}
