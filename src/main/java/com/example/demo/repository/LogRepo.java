package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.login;


@Repository
public interface LogRepo extends JpaRepository<login,String>  // Default Repo available in Spring JPA
{ 
    login findByUsernameAndPassword(String username,String password);

}
