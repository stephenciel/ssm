package cn.controller;

import cn.domain.Account;
import cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountServiceImpl;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> all = accountServiceImpl.findAll();
        httpServletRequest.setAttribute("list",all);


        return "forward:findAlla";


    }
    @RequestMapping("/findAlla")
    public String findAlla(ModelMap model){
        List list = (List) httpServletRequest.getAttribute("list");
        System.out.println(list);
        return "吃饭饭";
    }
}
