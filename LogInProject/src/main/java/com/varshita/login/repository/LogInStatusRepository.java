package com.varshita.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varshita.login.entity.LoginStatus;

@Repository
public interface LogInStatusRepository extends JpaRepository<LoginStatus, Double>{

}
