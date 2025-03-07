package com.sample.myapp.service;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TimesService {
    public String getTime() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
        return formattedDate;
    }
}
