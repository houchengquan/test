package cn.controller;

import cn.service.AccountService;
import cn.service.imp.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("mvc可用");
        accountService.findAll();

        return "list";
    }
}
