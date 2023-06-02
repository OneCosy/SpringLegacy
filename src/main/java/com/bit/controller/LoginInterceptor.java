package com.bit.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component(value = "inter")
public class LoginInterceptor implements HandlerInterceptor {
    @Override   // controller가 호출되기 전 호출
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return !request.getParameter("id").equals("Admin");
    }

    @Override   // controller가 실행된 후 호출
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        if (!(id.equals("BLUE") && password.equals("1234"))) {
            response.sendRedirect("/interceptorLogin");
        }
        System.out.println("postHandle================================================");
    }

    @Override   // 뷰에서 최종 결과가 생성하는 일을 포함한 모든 일이 완료 되었을 때 실행
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion===========================================");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
