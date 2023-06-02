package com.bit.controller;

import com.bit.dto.EmpDTO;
import com.bit.service.MvcOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MvcOptionCoreController {
    @Autowired
    private MvcOptionService mvcOptionService;

    @GetMapping("interceptorLogin")
    public String loginView() {
        return "mvcOptionView/adminLogin";
    }

    @PostMapping("loginInterChk")   // controller ---> (mapping  (sessioncheck)  loginInterProcess(핵심코드))  (sessioncheck)  (mapping redirectAttrProcess(핵심코드))
    public String loginInterProcess(HttpServletRequest request) {
        // Session CodeCheck

        return "mvcOptionView/loginView";
    }

    @ModelAttribute(name = "strList")   // view에서 ${strList}로 리턴 값을 불러올 수 있음
    public List<String> selectString() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("재홍이");
        list.add("도경이");
        list.add("규민이");
        list.add("민준이");

        return list;
    }

    @ModelAttribute(name = "empList")
    public List<EmpDTO> selectEmp() {
        return mvcOptionService.selectEmpList(null);
    }

    @RequestMapping(value = "/redirectAttr")
    public String redirectAttrProcess(RedirectAttributes redirectAttributes) {
        // BL수행
        redirectAttributes.addFlashAttribute("msg1", "Hi1Spring"); // redirect하면서 값이 같이 넘어가도록 함.
        redirectAttributes.addFlashAttribute("msg2", "Hi2Spring");
        redirectAttributes.addFlashAttribute("msg3", "Hi3Spring");
        return "redirect:/redirectlink";
    }

    @RequestMapping(value = "/redirectlink")
    public String redirectAttrProcessLink(@ModelAttribute("msg1") String msg1,
                                          @ModelAttribute("msg2") String msg2,
                                          @ModelAttribute("msg3") String msg3) {
        System.out.println("msg1 = " + msg1);
        return "mvcLocation/redirectlinkpage";
    }

    @GetMapping(value = "redirectRequest")
    public String redirectAttrCoreProcessLink(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("job", "SpringProcess");
        redirectAttributes.addFlashAttribute("state", "BackEnd");
        redirectAttributes.addFlashAttribute("count", 10);

        return "redirect:/next";
    }

    @GetMapping(value = "next")
    public String nextProcess(Model model, HttpServletRequest request) {
        System.out.println(request.getParameter("job"));    // 출력 안됨
        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request); //
        if (map!=null) {
            model.addAttribute("job", (String)map.get("job"));
            model.addAttribute("state", (String)map.get("state"));
            model.addAttribute("count", (int) map.get("count"));
        }
        return "mvcLocation/nextpage";
    }
}
