package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CartController {

    @GetMapping("login")
    public String loginView() {
        return "cart/adminLogin";
    }

    @PostMapping("/loginCheck")
    public String loginCheckPro(HttpSession session) {
        // login DBLOGIN CHECK
        // TRUE ----->
        return "redirect:/productList";
    }

    @GetMapping("/productList")
    public String productListProcess() {

        return "cart/productAdd";
    }
}
