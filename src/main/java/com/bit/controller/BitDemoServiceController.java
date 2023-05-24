package com.bit.controller;

import com.bit.dto.BitDemoDTO;
import com.bit.service.BitDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class BitDemoServiceController {
    @Resource(name = "bitDemoServiceImp")
    private BitDemoService service; // Controller는 Service를 가지고 있다.

    // BitDemoDTO의 생성자 실행하여 값 할당
    @PostMapping(value = "/demoBitInsert")
    public String insertDemoService(BitDemoDTO dto) throws Exception {
        System.out.println(dto);
        service.bitDemoInsert(dto); // BitDemoServiceImp의 bitDemoInsert() 호출
        return "redirect:/demoBitList";
    }

    @GetMapping(value = "/demoBitList")
    public String listDemoList(Model model) throws Exception {
        System.out.println("Select");
        model.addAttribute("list", service.selectBitDemo());
        return "mvcDemo/DemoList";
    }

}
