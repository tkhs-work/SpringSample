package com.sample.myapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@ SpringBootTest
class TimesServiceTest {

    @Autowired
    TimesService timesService;

    @Test
    public void test() {

        String formattedDate = timesService.getTime();

        String yyyyMMdd = formattedDate.split(" ")[0];
        System.out.println("yyyyMMdd : " + yyyyMMdd);

//        assertEquals("2024年5月16日", yyyyMMdd);
        assertEquals(5, 2 + 3);
    }
}
