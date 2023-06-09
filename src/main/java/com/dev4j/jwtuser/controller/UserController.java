package com.dev4j.jwtuser.controller;


import com.dev4j.jwtuser.model.User;
import com.dev4j.jwtuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Paginacion
    @GetMapping("")
    public ResponseEntity<Page<User>>getUser(@RequestParam("page") int page, @RequestParam("size") int size){
        return new ResponseEntity<>(userService.getAll(page,size), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User>getUserById(@PathVariable Integer userId){
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);

    }

}
