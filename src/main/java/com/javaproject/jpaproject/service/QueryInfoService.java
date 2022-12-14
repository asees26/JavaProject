package com.javaproject.jpaproject.service;

import com.javaproject.jpaproject.dto.QueryInfoDTO;
import com.javaproject.jpaproject.entity.QueryInfo;
import com.javaproject.jpaproject.repository.QueryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryInfoService {

    @Autowired
    private QueryInfoRepository queryInfoRepository;


    public QueryInfo createQueryInfo(QueryInfoDTO queryInfoDTO){

        QueryInfo newQueryInfo = new QueryInfo();
        newQueryInfo.setName(queryInfoDTO.getName());
        newQueryInfo.setOwner(queryInfoDTO.getOwner());
        newQueryInfo.setCreationTime(queryInfoDTO.getCreationTime());
        newQueryInfo.setDescription(queryInfoDTO.getDescription());

        queryInfoRepository.save(newQueryInfo);
        return newQueryInfo;
    }
}
