package com.kloan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController extends BaseController{

    // render html page
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object home(HttpServletRequest request) throws Exception{
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index(HttpServletRequest request) throws Exception{
        return "index";
    }

    // push a json result
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public Object json(HttpServletRequest request) throws Exception{
        return request.getAttribute("username") == null ? "" : request.getAttribute("username").toString();
    }


}
