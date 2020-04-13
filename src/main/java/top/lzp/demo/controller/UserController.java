package top.lzp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lzp.demo.entity.User;
import top.lzp.demo.service.UserService;


/**
 * @author Lu
 * @date 2020/4/12:19:45:15
 * @description
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //登录
    @RequestMapping("/login")
    public String login(User user){
        System.out.println(user);
        boolean success = userService.findUserByUsernameAndPassword(user);
        //登录成功
        if (success){
            return "login-success.html";
        }else {
            return "redirect:/";
        }

    }

    //注册
    @RequestMapping("/register")
    public String register(User user, String repassword, Model model){
        //检测用户名是否重复
        boolean isRegister = userService.isRegister(user);
        if (!isRegister){
            model.addAttribute("error","用户名重复");
            return "error.html";
        }
        if (user.getPassword().equals(repassword)){
            //密码与确认密码一致
            boolean success = userService.save(user);
            if (success){
                model.addAttribute("error","注册成功");
                return "error.html";
            }else {
                model.addAttribute("error","注册失败");
                return "error.html";
            }
        }else {
            //不一致
            model.addAttribute("error","密码输入不一致");
            return "error.html";
        }
    }
}
