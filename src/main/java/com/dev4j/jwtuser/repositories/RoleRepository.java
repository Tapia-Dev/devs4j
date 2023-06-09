package com.dev4j.jwtuser.repositories;

import com.dev4j.jwtuser.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
