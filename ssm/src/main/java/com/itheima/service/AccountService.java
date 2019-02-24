package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 账户业务层接口
 *
 * @author Small
 */
public interface AccountService {

    /**查询所有
     * @return
     */
    List<Account> findAll();

}
