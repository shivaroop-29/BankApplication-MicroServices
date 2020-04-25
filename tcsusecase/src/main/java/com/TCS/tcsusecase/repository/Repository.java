package com.TCS.tcsusecase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.TCS.tcsusecase.entity.Usermodel;

public interface Repository extends JpaRepository<Usermodel, String>{
Usermodel findByUsername(String userId);


}
