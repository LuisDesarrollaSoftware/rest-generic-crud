package com.luisdesarrollasoftware.restgenericcrud.example.infrastructure.controllers;


import com.luisdesarrollasoftware.restgenericcrud.example.dominio.entities.Example;
import com.luisdesarrollasoftware.restgenericcrud.example.dominio.services.ExampleServiceImpl;
import com.luisdesarrollasoftware.restgenericcrud.base.infrastructure.controllers.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/v1/autor")
public class ExampleController extends BaseControllerImpl<Example, ExampleServiceImpl> {

}
