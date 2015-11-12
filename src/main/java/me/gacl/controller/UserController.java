package me.gacl.controller;

import me.gacl.service.UserServiceI;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wuph on 2015/11/9.
 */
@Controller
@RequestMapping("/User")
public class UserController {
    @Resource
    private UserServiceI userService;

    @RequestMapping("getAllUser")
    public ModelAndView getAllUser(HttpServletRequest request) {
        ModelAndView model = new ModelAndView();
        List allUser = userService.getAllUser();
        System.out.println("----111----");
        System.out.println("2222");
        System.out.println("333");
        model.addObject("allUser",allUser);
        model.setViewName("allUser");
        return  model;
    }
}
