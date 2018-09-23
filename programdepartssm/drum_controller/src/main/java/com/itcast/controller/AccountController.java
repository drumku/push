package com.itcast.controller;

import com.itcast.dao.AccountMapper;
import com.itcast.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("findall")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<AccountMapper> all = accountService.findAll();
        modelAndView.addObject("list",all);
        modelAndView.setViewName("success");
        System.out.println(all);
        return modelAndView;
    }
}
