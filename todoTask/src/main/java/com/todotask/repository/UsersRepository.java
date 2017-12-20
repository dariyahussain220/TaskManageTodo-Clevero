package com.todotask.repository;

import org.springframework.data.repository.CrudRepository;

import com.todotask.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
    public Users findUsersByName(String name);

}
