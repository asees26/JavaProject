package com.javaproject.jpaproject.service;

import com.javaproject.jpaproject.dto.TransformerInfoDTO;
import com.javaproject.jpaproject.entity.TransformerInfo;
import com.javaproject.jpaproject.repository.TransformerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransformerInfoService {

    @Autowired
    TransformerInfoRepository transformerInfoRepository;

    public TransformerInfo createTransformerInfo(TransformerInfoDTO transformerInfoDTO){
        TransformerInfo newTransformerInfo = new TransformerInfo();
        newTransformerInfo.setCreatedBy(transformerInfoDTO.getCreatedBy());
        newTransformerInfo.setCreationTime(transformerInfoDTO.getCreationTime());
        newTransformerInfo.setCode(transformerInfoDTO.getCode());
        newTransformerInfo.setName(transformerInfoDTO.getName());

        transformerInfoRepository.save(newTransformerInfo);
        return newTransformerInfo;
    }
}
