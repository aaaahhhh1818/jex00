package com.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board/*") //board로 시작하는 request 링크는 여기서 관리
@Log4j2
public class BoardController {

    @GetMapping("/list") //get 방식으로 들어오면 동작 //얘 경로는 /board/list
    public void list() {

        log.info("list.......................");
        log.info("list.......................");
        log.info("list.......................");
        log.info("list.......................");

    } // 리턴 안주고 void 주면 호출하는 url 경로 찾음

}
