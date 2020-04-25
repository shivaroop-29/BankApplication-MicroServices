package com.usecase.Accountapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase.Accountapp.model.Rewards_Table;
import com.usecase.Accountapp.model.Transaction_table;

public interface Transaction_Repository extends JpaRepository<Transaction_table, String>{
	
}
