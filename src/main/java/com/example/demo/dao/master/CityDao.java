package com.example.demo.dao.master;

import com.example.demo.entity.CityBean;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解式变成变成一定要加mapper,同时因为是注解式编程所以要将这个类加上@Repository，代表这是一个dao
//@Mapper
@Repository
public interface CityDao {
    //获取所有的城市
//    @Select("select * from city")
    List<CityBean> getAllCity();
}
