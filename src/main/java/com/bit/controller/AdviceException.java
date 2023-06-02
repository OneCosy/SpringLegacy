package com.bit.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AdviceException {

    @ExceptionHandler(Exception.class)
    public ModelAndView processException1(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mvcOptionView/exceptionView");
        modelAndView.addObject("exception", e);

        return modelAndView;
    }
}
