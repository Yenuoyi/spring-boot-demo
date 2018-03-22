package com.example.demo.service.impl;

import com.example.demo.dao.master.CountyRepository;
import com.example.demo.entity.County;
import com.example.demo.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountyServiceImpl implements CountyService{
    @Autowired
    private CountyRepository countyRepository;

    @Override
    public County findByCountyName(String countyName) {
        return countyRepository.findCountyByCityName("梅县区");
    }
}
