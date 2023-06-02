package com.bit.controller;

import com.bit.dto.JsonBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController // Dispatcher 안됨
public class RestControllerEx {

    @PostMapping(value = "ajaxTest5")
    public String ajaxTestProcess5() {
        return "Success RestController";
    }

    @PostMapping(value = "ajaxTest6")
    public JsonBody ajaxTestProcess6() {
        return new JsonBody("mySql", "seoul", "127.0.0.1", 1000);
    }

    @PostMapping(value = "ajaxTest7")
    public HashMap<Integer, JsonBody> ajaxTestProcess7() {
        HashMap<Integer, JsonBody> map = new HashMap<Integer, JsonBody>();
        map.put(1, new JsonBody("mySql", "seoul", "127.0.0.1", 1000));
        map.put(2, new JsonBody("oracle", "busan", "211.183.123.89", 5000));

        return map;
    }

    @PostMapping(value = "ajaxTest8")
    public List<HashMap<Integer, JsonBody>> ajaxTestProcess8() {
        HashMap<Integer, JsonBody> map = new HashMap<Integer, JsonBody>();
        ArrayList<HashMap<Integer, JsonBody>> list = new ArrayList<HashMap<Integer, JsonBody>>();
        map.put(1, new JsonBody("mySql", "seoul", "127.0.0.1", 1000));
        map.put(2, new JsonBody("oracle", "busan", "211.183.123.89", 5000));
        list.add(map);

        return list;
    }
}
