package com.learn.lph.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl
{
    @WebMethod
    public String say(String name)
    {
        return "hello, " + name;
    }
}
