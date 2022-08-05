package com.pm430.springbootdatajpa.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);

//    Optional<Account> findByUsername(String username);
}
