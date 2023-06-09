package com.dev4j.jwtuser.controller;

import com.dev4j.jwtuser.model.Role;
import com.dev4j.jwtuser.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class RolController {


    @Autowired
    private RoleServices roleServices;


    @GetMapping("")
    public ResponseEntity<List<Role>>getRoles(){
        return new ResponseEntity<>(roleServices.getRoles(), HttpStatus.OK);

    }

    @PostMapping("")
    public ResponseEntity<Role>createRole(@RequestBody Role role){
        return new ResponseEntity<>(roleServices.creteRole(role),HttpStatus.CREATED);
    }

    @PutMapping ("/{roleId}")
    public ResponseEntity<Role>updateRole(@PathVariable Integer roleId, @RequestBody Role role){
        return new ResponseEntity<>(roleServices.updateRole(roleId, role),HttpStatus.OK);
    }

    @DeleteMapping("/{roleId}")
    public ResponseEntity<Void>deleteRole(@PathVariable Integer roleId){
        roleServices.deleteRole(roleId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }

}
