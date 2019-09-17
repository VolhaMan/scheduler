package com.scheduler.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;

@Controller
public class SchedulerController {
    public String add(@RequestParam("text") String text, @RequestParam("number") String number, @RequestParam("date") Date date) {
        throw new NotImplementedException();
    }

    public String get(@RequestParam("number") String number) {
        throw new NotImplementedException();
    }

    public String delete(@RequestParam("id")int id) {
        throw new NotImplementedException();
    }
}
