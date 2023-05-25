package com.bit.di.test2;

import org.springframework.stereotype.Repository;

// UserRepositoryImpl 구현 클래스
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(String username) {
        // 사용자 정의 로직
        System.out.println("User saved: " + username);
    }
}
