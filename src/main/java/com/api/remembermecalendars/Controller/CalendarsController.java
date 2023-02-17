package com.api.remembermecalendars.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/calendars")
public class CalendarsController {

    @GetMapping()
    public String hello(){
        return "Hello from clendars";
    }
}
