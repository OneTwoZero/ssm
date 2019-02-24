package com.itheima.controller;


import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Small
 */
@Controller
@RequestMapping("/accountController")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("springMVC...................");
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "success";
    }
}
