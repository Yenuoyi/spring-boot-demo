package com.example.demo.dao.master;

import com.example.demo.entity.County;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyRepository  extends JpaRepository<County, Integer> {
    @Query(value = "select * from county where countyName = ?1",nativeQuery = true)
    County findCountyByCityName(String countyName);
}
