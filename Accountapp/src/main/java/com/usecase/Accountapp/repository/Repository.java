package com.usecase.Accountapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase.Accountapp.model.Accounts_Table;

public interface Repository extends JpaRepository<Accounts_Table, String>{


}
