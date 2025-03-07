package com.sample.myapp.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.myapp.form.MyNameForm;
import com.sample.myapp.service.TimesService;

@Controller
public class NextController {
    @Autowired
    TimesService timesService;

    @RequestMapping(value = "/next", method = RequestMethod.POST)
    public String next(Locale locale, Model model, MyNameForm myNameForm) {
        model.addAttribute("myName", myNameForm.getMyName());

        String time = timesService.getTime();
        model.addAttribute("time", time);
        return "next";
    }
}
