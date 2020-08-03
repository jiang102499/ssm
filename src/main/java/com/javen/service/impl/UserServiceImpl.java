package com.javen.service.impl;

import com.javen.mapper.UserMapper;
import com.javen.pojo.User;
import com.javen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper mapper;

    public List<User> getUserById() {
        // TODO Auto-generated method stub
        return this.mapper.getUserById();
    }
}

