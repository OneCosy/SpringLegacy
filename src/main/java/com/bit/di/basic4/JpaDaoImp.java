package com.bit.di.basic4;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class JpaDaoImp implements UserDao {
    @Override
    public void selectAllUser() {
        System.out.println("JpaDaoImp selectAllUser");
    }

    @Override
    public void updateUser() {
        System.out.println("JpaDaoImp updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("JpaDaoImp deleteUser");
    }
}
