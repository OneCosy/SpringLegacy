package com.bit.di.basic4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AdminUserServiceImp implements UserService {
    @Resource(name = "myBatisDao")
    private UserDao myBatisDao;

/*
    @Resource(name = "jpaDaoImp")
    private UserDao jpaDaoImp;
*/

    @Override
    public void register() {
        myBatisDao.selectAllUser();
    }

    @Override
    public void finduser() {
//        jpaDaoImp.selectAllUser();
    }
}
