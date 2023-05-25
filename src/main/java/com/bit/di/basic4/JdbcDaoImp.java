package com.bit.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImp implements UserDao {
    @Override
    public void selectAllUser() {
        System.out.println("JdbcDaoImp selectAllUser");
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
