package com.example.mapper;

import com.example.jex00.config.RootConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class}) //설정파일 설정
public class TimeMapperTests {

    @Autowired //test 코드에서는 자동주입 안됨. 항상 Autowired 걸어주기
    TimeMapper timeMapper; //mybatis에서 못 받기 때문에 에러발생 disable 처리 해줘야함

    @Test
    public void testGetTime1() {

        log.info(timeMapper);
        log.info(timeMapper.getTime());

    }

}
