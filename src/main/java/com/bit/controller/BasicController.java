package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class BasicController {
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String helloMessage(Model model) {
        System.out.println("helloMessage");
        model.addAttribute("message", "HelloBasicController");
//        return "redirect:/basicView/messageView";   //Dispatcher
        return "basicView/messageView";   //Dispatcher
    }

    @GetMapping(value = "/lesson")
    public ModelAndView lessonMessage() {
        // ModelAndView : Spring MVC에서 컨트롤러의 처리 결과 및 모델 데이터를 보유하는 클래스
        ModelAndView modelAndView = new ModelAndView();
        // 모델 데이터 추가
        modelAndView.addObject("lesson", "SpringLesson");
        // 뷰 이름 설정
        modelAndView.setViewName("basicView/messageLesson");

        return modelAndView;
    }

    /*
        @RequestParam(value : HTTP 요청의 매개변수, required : 매개변수가 필수인지 아닌지, defaultValue : 매개변수가 제공되지 않을 경우 기본값)
    */
    @PostMapping(value = "/empValue")
    public String empValueProcess(@RequestParam(value = "job", required = false, defaultValue = "doctor") String job,
                                  @RequestParam(value = "sal", required = false, defaultValue = "1000") int sal, Model model) {
        model.addAttribute("job", job);
        model.addAttribute("sal", sal);
        return "basicView/empView";
    }

    @PostMapping(value = "/lessonCheck")
    public String empValueProcess(Model model, HttpServletRequest request) {
        // 값이 1개면 .getParameter();
        // 값이 여러 개면 .getParameterValues();
        String[] chValue = request.getParameterValues("lesson");
        model.addAttribute("chValue", chValue);
        return "basicView/lessonCheck";
    }

//    @PostMapping(value = "/lessonCheck")
//    public String empValueProcess(@RequestParam(value = "lesson", required = false, defaultValue = "Subject") String lesson, Model model) {
//        model.addAttribute("lesson", lesson);
//        return "basicView/lessonCheck";
//    }

    @PostMapping(value="/loginCheck")
    public String loginCheck(Model model, HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        String state = "";

        System.out.println(id);
        System.out.println(pass);

        if (id.equals("Admin") && pass.equals("1234")) {
            state = "T";
            model.addAttribute("state", state);
            return "redirect:/listCheck";
        } else {
            state = "F";
            model.addAttribute("state", state);
            return "Login";
        }

//        try {
//            String id = request.getParameter("id");
//            String pass = request.getParameter("pass");
//            String state = "";
//
//            System.out.println(id);
//            System.out.println(pass);

//            PrintWriter out = response.getWriter();
//
//            if (id.equals("Admin") && pass.equals("1234")) {
//                request.getSession().setAttribute("id", id);
//
//                // signin.jsp의 data에 값 전달
//                out.print("T");
//            } else {
//                // signin.jsp의 data에 값 전달
//                out.print("F");
//            }
//            out.flush();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "basicView/Login";   //Dispatcher
    }

    @GetMapping(value = "/listCheck")
    public String listProcess(Model model, HttpServletRequest request) {
        return "basicView/List";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listPage(Model model) {
        return "cart/productList";
    }
}
