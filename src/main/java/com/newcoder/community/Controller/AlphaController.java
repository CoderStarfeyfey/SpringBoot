package com.newcoder.community.Controller;

import com.newcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author feyfey
 * @create 2022/6/28
 * @University JiangHan Univiersity
 */
@Controller
@RequestMapping("/alpha")
//通过这个名字访问这个类
public class AlphaController {
    @Autowired
    private AlphaService alphaService;
    @RequestMapping("/hello")
    @ResponseBody

    //告诉游览器访问的只是一个一个字符串而不是网页
    public String sayHello(){
        return "hello woaini";
    }

    @RequestMapping("/testDeomo2")
    @ResponseBody
    public String testDemo02(){
        return alphaService.find();
    }
}
