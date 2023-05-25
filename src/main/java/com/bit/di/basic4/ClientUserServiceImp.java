package com.bit.di.basic4;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ClientUserServiceImp implements UserService {
    @Resource(name = "jdbcDaoImp")
    private UserDao dao;

    @Override
    public void register() {
        dao.selectAllUser();
    }

    @Override
    public void finduser() {

    }
}
