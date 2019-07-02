package com.pablo.autos.repositories;

import com.pablo.autos.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
