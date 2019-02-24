package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Small
 */
@Repository
public interface AccountDao {

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();
}
