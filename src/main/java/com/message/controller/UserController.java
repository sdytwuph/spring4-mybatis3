package com.message.controller;

import com.message.service.UserServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuph on 2015/11/9.
 */
@Controller
@RequestMapping("/User")
public class UserController {
    @Resource
    private UserServiceI userService;

    @RequestMapping(value="getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public String getAllUser(HttpServletRequest request, HttpServletResponse response) {
        String msg = request.getParameter("msg");
        if(msg==null||msg==""){
            msg="msg IS NULL";
        }
        return  msg;
    }
    @RequestMapping(value="login/updatePwd",method = RequestMethod.GET)
    @ResponseBody
    public String updatePwd(HttpServletRequest request, HttpServletResponse response) {
       System.out.println("resetPwd");
        return "resetPwd";
    }
}
