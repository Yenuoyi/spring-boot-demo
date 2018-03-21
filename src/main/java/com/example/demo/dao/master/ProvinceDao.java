package com.example.demo.dao.master;

import com.example.demo.entity.ProvinceBean;
import org.springframework.stereotype.Repository;

import java.util.List;

//非注解式编程
@Repository
public interface ProvinceDao {
    //获取所有的省份
    List<ProvinceBean> getAllProvince();
}
