package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: colin
 * @Date: 2018/12/22 09:28
 * @Description:
 * @Version: V1.0
 */
@Controller
public class TestController {


    @RequestMapping(value = "/msg/{msg}",method = RequestMethod.GET)
    @ResponseBody
    public String getMsg(@PathVariable("msg")String msg){
        System.out.println("哈哈，再试一次");
        return "the new msg is will be 呵呵 终于打通了 唉 不容易啊；今天很好高兴啊 哈哈 " + msg;
    }
}
