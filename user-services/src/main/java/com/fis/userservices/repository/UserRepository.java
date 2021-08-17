package com.fis.userservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.userservices.beans.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
