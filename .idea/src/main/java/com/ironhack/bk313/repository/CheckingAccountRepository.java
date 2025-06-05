package com.ironhack.bk313.repository;

import com.ironhack.bk313.model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {
    // Add specific methods if needed
}