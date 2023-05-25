package com.bit.di.basic4;

import org.springframework.stereotype.Component;

@Component(value = "myBatisDao")
public class MyBatisDaoImp implements UserDao {
    @Override
    public void selectAllUser() {
        System.out.println("MyBatisDaoImp selectAllUser");
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
