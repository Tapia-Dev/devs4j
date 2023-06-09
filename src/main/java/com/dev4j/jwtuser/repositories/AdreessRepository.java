package com.dev4j.jwtuser.repositories;

import com.dev4j.jwtuser.model.Adreess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdreessRepository extends CrudRepository<Adreess, Integer> {
}
