package com.javaproject.jpaproject.controller;

import com.javaproject.jpaproject.dto.TransformerInfoDTO;
import com.javaproject.jpaproject.entity.TransformerInfo;
import com.javaproject.jpaproject.service.TransformerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/TransformerInfo")
public class TransformerInfoController {
    @Autowired
    TransformerInfoService transformerInfoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TransformerInfo> createTransformerInfo(@RequestBody TransformerInfoDTO transformerInfoDTO){
        return new ResponseEntity<>(transformerInfoService.createTransformerInfo(transformerInfoDTO),HttpStatus.CREATED);
    }

}
