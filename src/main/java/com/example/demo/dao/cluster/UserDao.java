package com.example.demo.dao.cluster;

import com.example.demo.entity.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserBean> getAllUser();
}
