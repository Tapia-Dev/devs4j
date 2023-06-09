package com.dev4j.jwtuser.repositories;

import com.dev4j.jwtuser.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserReposiory extends JpaRepository<User, Integer> {


    /**
     * Esto no es SQL ES JPQL
     * @TAPI@
     */
//   @Query("SELECT u.username from User u")
    @Query("SELECT u.username FROM User u WHERE u.username LIKE 'a%'\n")
    public List<String>findUsernames();

}
