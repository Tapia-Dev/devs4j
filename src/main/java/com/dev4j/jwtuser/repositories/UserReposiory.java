package com.dev4j.jwtuser.repositories;

import com.dev4j.jwtuser.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserReposiory extends JpaRepository<User, Integer> {

}
