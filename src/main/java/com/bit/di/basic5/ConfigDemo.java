package com.bit.di.basic5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
@ImportResource({"person.xml"})
public class ConfigDemo {
    @Bean(name = "stateServer")
    public StateServer getStateServer() {
        return new StateServer("127.0.0.1:8080:mySql", 7777, "scott", "tiger");
    }

    @Bean
    public DmlServer getDmlServer() {
        return new DmlServer(new StateServer("211.89.0.1:88:oracle", 8888, "bit", "bit1234"));
    }

    @Bean
    public Map<String, String> getMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "딸기");
        map.put("2", "수박");
        map.put("3", "멜론");
        map.put("4", "키위");

        return map;
    }

    @Bean
    public Properties getProperties() {
        Properties p = new Properties();
        p.put("/web/list/userList", getMap());
        p.put("/web/login/userLogin", getDmlServer());

        return p;
    }
}
