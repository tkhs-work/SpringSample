package com.sample.myapp.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.myapp.form.MyNameForm;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        MyNameForm myNameForm = new MyNameForm();
        model.addAttribute("MyNameForm", myNameForm);
        return "home";
    }
}

