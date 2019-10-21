package cn.service;

import cn.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //添加账户
    public void saveAccount(Account account);
}
