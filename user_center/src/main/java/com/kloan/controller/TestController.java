package com.kloan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: AsyncGo
 * Date:   2018/7/19 17:25
 * Description:
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/alive", method = RequestMethod.GET)
    public Object alive(HttpServletRequest request) throws Exception {
        return "200";
    }

}