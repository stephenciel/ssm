package cn.service.impl;


import cn.dao.AccountDao;
import cn.domain.Account;

import cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        List<Account> all = accountDao.findAll();
        System.out.println(all);
        return all;
    }

    public List<Account> findAlla() {
        System.out.println("u...");
//        List<Account> all = accountDao.findAll();
//        return all;
        return null;
    }


}
