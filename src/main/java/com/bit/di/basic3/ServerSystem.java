package com.bit.di.basic3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 의존성 : 의존하고 있는 객체의 레퍼런스를 취득하는 것
@Component  // new ServerSystem이랑 동일
public class ServerSystem {

    @Autowired
    private DbmsSystem db;

    public ServerSystem() {
    }

    public ServerSystem(DbmsSystem db) {
        this.db = db;
    }

    public DbmsSystem getDb() {
        return db;
    }

    public void setDb(DbmsSystem db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "ServerSystem{" +
                "db=" + db +
                '}';
    }
}
