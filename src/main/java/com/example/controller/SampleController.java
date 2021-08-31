package com.example.controller;

import com.example.dto.BoardDTO;
import com.example.service.Hello;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@Log4j2
public class SampleController {

    @Autowired
    private Hello hello;

    @GetMapping("/doA")
    public void doA(String name, int age) { //파라미터 자동으로 수집
        log.info("doA................");
        log.info(name);
        log.info(age);
    }

    @GetMapping("/doB")
    public void doB(String name, int[] arr) { //파라미터 자동으로 수집
        log.info("doA................");
        log.info(name);
        log.info(Arrays.toString(arr));
    }

    @GetMapping("/doC")
    public void doC(BoardDTO boardDTO, Model model) { //Model 파라미터 선언할 때는 제일 마지막에 선언
        log.info("doC.................");
        log.info(boardDTO);
        model.addAttribute("bno", 32L); //이 데이터를 수집해서 board라는 이름으로 jsp에 전달
    }

    @GetMapping("doD")
    public String doD(RedirectAttributes redirectAttributes) {
        log.info("------------doD-------------");
        log.info("------------doD-------------");
        log.info("------------doD-------------");
        redirectAttributes.addFlashAttribute("bno", 321); //addFladhAttribute 일회용으로 사용
        return "redirect:/hello"; //doD를 호출하면 redirect 돼서 /hello 호출함
    }


//    <resources mapping="/resources/**" location="/resources/" /> //root-context.xml 설정
    @GetMapping("/hello")
    public void hello() {

        log.info("hello.................");
        log.info("hello.................");
        log.info(hello);
        log.info("hello.................");
        log.info("hello.................");

    }

}
