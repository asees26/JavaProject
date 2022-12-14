package com.javaproject.jpaproject.controller;

import com.javaproject.jpaproject.dto.QueryInfoDTO;
import com.javaproject.jpaproject.entity.QueryInfo;
import com.javaproject.jpaproject.service.QueryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/QueryInfo")
public class QueryInfoController {

    @Autowired
    QueryInfoService queryInfoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<QueryInfo> createQueryInfo(@RequestBody QueryInfoDTO queryInfoDTO){
        return new ResponseEntity<>(queryInfoService.createQueryInfo(queryInfoDTO),HttpStatus.CREATED);
    }

}
