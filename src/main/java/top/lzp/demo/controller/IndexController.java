package top.lzp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lu
 * @date 2020/4/12:18:19:17
 * @description
 */
@Controller
public class IndexController {
    //首页
    @RequestMapping("")
    public String mainIndex(){
        return "index.html";
    }
    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }



}
