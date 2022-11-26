package com.luisdesarrollasoftware.restgenericcrud.example.dominio.services;

import com.luisdesarrollasoftware.restgenericcrud.example.dominio.services.Interfaces.ExampleService;
import com.luisdesarrollasoftware.restgenericcrud.base.dominio.services.BaseServiceImpl;
import com.luisdesarrollasoftware.restgenericcrud.example.dominio.entities.Example;
import com.luisdesarrollasoftware.restgenericcrud.example.dominio.repositories.ExampleRepository;
import com.luisdesarrollasoftware.restgenericcrud.base.dominio.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl extends BaseServiceImpl<Example, Long> implements ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public ExampleServiceImpl(BaseRepository<Example, Long> repository) {
        super(repository);
    }

}
