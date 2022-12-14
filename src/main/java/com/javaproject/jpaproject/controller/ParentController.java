//package com.javaproject.jpaproject.controller;
//
//import com.javaproject.jpaproject.dto.ParentDTO;
//import com.javaproject.jpaproject.entity.Parent;
//import com.javaproject.jpaproject.service.ParentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value = "api")
//public class ParentController {
//    @Autowired
//    ParentService parentService;
//
//    @PostMapping(value = "/{entity}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<Parent> createParent(@RequestBody ParentDTO parentDTO, @PathVariable Parent entity){
//        return new ResponseEntity<>(parentService.createParent(parentDTO, entity),HttpStatus.CREATED);
//    }
//}
