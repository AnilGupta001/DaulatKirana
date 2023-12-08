package com.apnigrocery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnigrocery.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
