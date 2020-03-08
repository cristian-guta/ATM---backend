package com.test.demo.repository;

import com.test.demo.dto.AccountDTO;
import com.test.demo.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

    Account findAccountsByName(String name);

    List<AccountDTO> findAccountsByClient_Cnp(String cnp);

    Account findAccountById(int id);


}

