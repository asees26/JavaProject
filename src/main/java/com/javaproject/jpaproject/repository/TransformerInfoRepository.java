package com.javaproject.jpaproject.repository;
import com.javaproject.jpaproject.entity.TransformerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransformerInfoRepository extends JpaRepository<TransformerInfo,Long> {

    public List<TransformerInfo> findByName(String name);
}
