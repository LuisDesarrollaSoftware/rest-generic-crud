package com.luisdesarrollasoftware.restgenericcrud.example.dominio.repositories;

import com.luisdesarrollasoftware.restgenericcrud.example.dominio.entities.Example;
import com.luisdesarrollasoftware.restgenericcrud.base.dominio.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends BaseRepository<Example,Long> {
}
