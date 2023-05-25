package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("**/app/")  // 아무 경로/app/ 으로 들어왔을 때
public class MvcLocationController {
    @GetMapping(value = "mvcApp")
    public String mvcAppList() {
        /**
         * dispatcher인 경우 InternalResourceViewResolver 접근
         * redirect는 dispatcher 안타고 바로 url 접근 (.jsp로 바로 접근하지 마라는 뜻)
         */
//        return "redirect:/mvcAppView.jsp";
        return "mvcLocation/mvcAppView";    // viewName
//        return "redirect:/mvcLocation/mvcAppView";
    }

    @GetMapping(value = "salGrades")
    public String mvcAppListSal() {
        return "mvcLocation/mvcAppView";
    }
}
