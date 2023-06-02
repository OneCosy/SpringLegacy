package com.bit.controller;

import com.bit.dto.JsonBody;
import com.bit.dto.EmpDTO;
import com.bit.service.MvcOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MvcOptionController {

    @Autowired
    private MvcOptionService mvcOptionService;

    /**
     *
     * ename과 job 변수에 전달받은 값을 받음
     * 해당 값을 @PathVariable 어노테이션으로 변수에 저장
     */

    @GetMapping(value = "pathParam")
    public String selectEmpEnameListParamEmpty(Model model) {
        model.addAttribute("empList", mvcOptionService.selectEmpList(null));
        return "mvcOptionView/empViewsSyn";
    }

    @GetMapping(value = "pathParam/{job}")
//    public String selectEmpList(@PathVariable("ename")String ename, @PathVariable(value = "job", required = false)String job) {
//    public String selectEmpList(@PathVariable EmpDTO dto) {
    public String selectEmpList(@PathVariable HashMap<String, Object> pathMap, Model model) {
        model.addAttribute("empList", mvcOptionService.selectEmpList(pathMap));
        return "mvcOptionView/empViewsSyn";
    }

    @GetMapping(value = "pathParam/{ename}/{job}")
//    public String selectEmpList(@PathVariable("ename")String ename, @PathVariable(value = "job", required = false)String job) {
//    public String selectEmpAllList(@PathVariable EmpDTO dto) {
    public String selectEmpAllList(@PathVariable HashMap<String, Object> pathMap, Model model) {
        model.addAttribute("empList", mvcOptionService.selectEmpList(pathMap));
        return "mvcOptionView/empViewsSyn";
    }

    @PostMapping(value = "deleteCheck")
    public String deleteEmp(@RequestParam(value = "empnoCk", required = false) List<String> list, Model model) {

        mvcOptionService.deleteEmpList(list);
        model.addAttribute("empList", mvcOptionService.selectEmpList(null));

        return "mvcOptionView/empViewsSyn";
    }

    //AjaxTest
    @RequestMapping(value = "ajaxTest1", method = RequestMethod.POST)
    public String ajaxTestProcess1(Model model) {
        model.addAttribute("ajax", "AjaxTest1");

        return "mvcAjaxView/resultAjaxMvc1";
    }

    @RequestMapping(value = "ajaxTest2", method = RequestMethod.POST)
    public String ajaxTestProcess2(Model model, @RequestBody HashMap<String, Object> map) { // @RequestBody json을 자바로 받아주는 부분
        System.out.println(map);
        model.addAttribute("ajax", map);

        return "mvcAjaxView/resultAjaxMvc1";
    }

    @ResponseBody
    @RequestMapping(value = "ajaxTest3", method = RequestMethod.POST)
    public List<EmpDTO> ajaxTestProcess3(Model model, @RequestBody HashMap<String, Object> map) { // @RequestBody json을 자바로 받아주는 부분
        System.out.println(map);
//        model.addAttribute("ajax", map);

        return mvcOptionService.selectEmpList(null);
    }

    @ResponseBody
    @RequestMapping(value = "ajaxTest4", method = RequestMethod.POST)
    public EmpDTO ajaxTestProcess4(Model model, @RequestBody JsonBody jsonBody) { // @RequestBody json을 자바로 받아주는 부분
        System.out.println(jsonBody);

        return (mvcOptionService.selectEmpList(null)).get(0);
    }

    @GetMapping(value = "header1")
    public String processOption1(@RequestHeader("Accept") String acceptType,
                                 @RequestHeader("Host") String host,
                                 @RequestHeader("user-Agent") String userAgent,
                                 Model model) {
        model.addAttribute("acceptType", acceptType);
        model.addAttribute("host", host);
        model.addAttribute("userAgent", userAgent);

        return "mvcOptionView/resultProcessOption1";
    }

    @GetMapping(value = "header2")
    public String processOption2(@RequestHeader Map<String, String> map, Model model) {
        model.addAttribute("map", map);

        return "mvcOptionView/resultProcessOption1";
    }

    @GetMapping(value = "nullPoint")
    public String exceptionMake1(Model model) {
        String str = null;
        str.length();   // NullPointException 발생 -> processException1로 이동
        model.addAttribute("message", "nullPoint");
        return "mvcOptionView/ViewSuccess";
    }

    @GetMapping(value = "classCast")
    public String exceptionMake2(Model model) {
        String s = (String) new Object();   // ClassCastException 발생 -> processException2로 이동
        model.addAttribute("message", "classCast");
        return "mvcOptionView/ViewSuccess";
    }

    @GetMapping(value = "numberFormat")
    public String exceptionMake3(Model model) {
        String str = null;
        Integer.parseInt(str);  // NumberFormatException 발생 -> processException3로 이동
        model.addAttribute("message", "numberFormat");
        return "mvcOptionView/ViewSuccess";
    }

//    @ExceptionHandler(NullPointerException.class)
//    public ModelAndView processException1(NullPointerException e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("mvcOptionView/exceptionView");
//        modelAndView.addObject("exception", e);
//
//        return modelAndView;
//    }
//
//    @ExceptionHandler(ClassCastException.class)
//    public ModelAndView processException2(ClassCastException e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("mvcOptionView/exceptionView");
//        modelAndView.addObject("exception", e);
//
//        return modelAndView;
//    }
//
//    @ExceptionHandler(NumberFormatException.class)
//    public ModelAndView processException3(NumberFormatException e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("mvcOptionView/exceptionView");
//        modelAndView.addObject("exception", e);
//
//        return modelAndView;
//    }
}
