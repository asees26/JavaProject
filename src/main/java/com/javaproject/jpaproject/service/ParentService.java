//package com.javaproject.jpaproject.service;
//
//import com.javaproject.jpaproject.dto.ParentDTO;
//import com.javaproject.jpaproject.entity.Parent;
//import com.javaproject.jpaproject.repository.ParentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ParentService {
//
//    @Autowired
//    ParentRepository parentRepository;
//
//    public Parent createParent(ParentDTO parentDTO, Object entity){
//        Parent parent = new Parent();
//        if(entity instanceof Parent){
//           parent = save(parentDTO, entity);
//        }
//        return parent;
//    }
//    public Parent save(ParentDTO parentDTO,Object entity){
//        Parent parent = new Parent();
//
//        parent.setModifiedBy(parentDTO.getModifiedBy());
//        parent.setLastModifiedTime(parentDTO.getLastModifiedTime());
//        parentRepository.save(parent);
//        return parent;
//    }
//}
