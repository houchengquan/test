package cn.service.imp;

import cn.domain.Account;
import cn.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImp implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("可用");
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }
}
