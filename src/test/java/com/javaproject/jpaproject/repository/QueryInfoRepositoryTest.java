//package com.javaproject.jpaproject.repository;
//
//import com.javaproject.jpaproject.entity.QueryInfo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.naming.Name;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//
//class QueryInfoRepositoryTest {
//
//    @Autowired
//    private QueryInfoRepository queryInfoRepository;
//
//    @Test
//    public void saveQueryInfo(){
//        QueryInfo queryInfo = QueryInfo.builder()
//                .Name("must_do_actions")
//                .creationTime("2022-11-23")
//                .description("must do actions sales value")
//                .owner("asees")
//                .build();
//        queryInfoRepository.save(queryInfo);
//
//
//
//    }
//
//}