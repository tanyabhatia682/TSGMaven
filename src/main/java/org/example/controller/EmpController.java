package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EmpController
{

    @GetMapping(value = "/v1/test",produces = APPLICATION_JSON_VALUE)
    public String test()
    {
        return "Test Application";
    }

}

