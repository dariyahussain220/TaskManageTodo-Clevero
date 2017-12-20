package com.todotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todotask.model.Users;
import com.todotask.repository.UsersRepository;

@RestController
@RequestMapping("")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/try")
    public String demoPlan(@RequestBody Users u) {
        Users a = usersRepository.save(u);
        return a.getName();
    }
}
