package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.master.ProvinceDao;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public String getAllProvince() {
        return JSONObject.toJSONString(provinceDao.getAllProvince());
    }
}
