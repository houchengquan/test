package cn.dao;

import cn.domain.Account;

import java.util.List;
/*数据层*/
public interface AccountDao {
//查询所有
    public List<Account> findAll();
//添加账户
    public void saveAccount(Account account);
}
