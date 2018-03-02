package com.yk.findbyusername.controller;

import com.yk.findbyusername.domain.Userinfo;
import com.yk.findbyusername.reposiroty.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/findby")
public class UserinfoController {

    @Autowired
    private UserinfoRepository userinfoRepository;
    @RequestMapping(value = "/username")
    public Userinfo findByUsername()
    {
        Userinfo userinfo = userinfoRepository.findByUsername("yk001");
        System.out.println(userinfo.toString());
        return userinfo;
    }
    @RequestMapping(value = "/usernameandpassword")
    public Userinfo findByUsernameAndPassword()
    {
        Userinfo userinfo = userinfoRepository.findByUsernameAndPassword("yk002","pw002");

        System.out.println(userinfo.toString());
        return  userinfo;
    }
}
