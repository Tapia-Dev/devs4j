package com.dev4j.jwtuser.services;

import com.dev4j.jwtuser.model.User;
import com.dev4j.jwtuser.repositories.UserReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserReposiory userReposiory;


    // Paginacion
    public Page<User> getAll(int page, int size){
         return userReposiory.findAll(PageRequest.of(page, size));

    }


    public User getUserById(Integer userId){
        return userReposiory.findById(userId).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        String.format("No encontrado")));
    }

    public List<String> getUsernames(){
        return userReposiory.findUsernames();

    }



}
