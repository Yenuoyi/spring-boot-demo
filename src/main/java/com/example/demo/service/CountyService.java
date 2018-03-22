package com.example.demo.service;

import com.example.demo.entity.County;

public interface CountyService {
    County findByCountyName(String countyName);

}
