package com.javaproject.jpaproject.repository;
import com.javaproject.jpaproject.entity.QueryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueryInfoRepository extends JpaRepository<QueryInfo,Long> {

    public List<QueryInfo> findByName(String name);

}

