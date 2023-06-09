package com.dev4j.jwtuser.services;

import com.dev4j.jwtuser.model.Role;
import com.dev4j.jwtuser.repositories.RoleRepository;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServices {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role>getRoles(){
        return  roleRepository.findAll();
    }

    public Role creteRole(Role role){
        return roleRepository.save(role);
    }

    public Role updateRole(Integer roleId, Role role){
        Optional<Role> result = roleRepository.findById(roleId);
        if (result.isPresent()){
            return roleRepository.save(role);

        }else {
            throw  new ResponseStatusException(HttpStatus.BAD_GATEWAY,String.format("No existe"));
        }

    }
    public void deleteRole(Integer roleId){
        Optional<Role> resul = roleRepository.findById(roleId);
        if (resul.isPresent()){
            roleRepository.deleteById(roleId);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("No existe"));
        }

    }

}
