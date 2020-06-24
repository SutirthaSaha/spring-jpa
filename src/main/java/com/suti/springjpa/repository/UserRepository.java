package com.suti.springjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.suti.springjpa.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
