package com.example.service;

import org.springframework.stereotype.Service;

@Service //component와 비슷한 annotation
public class KoreanHello implements Hello {

    @Override
    public String sayHello() {
        return "An Nenung ha se yo";
    }

}
