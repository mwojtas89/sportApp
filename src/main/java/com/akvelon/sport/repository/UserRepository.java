package com.akvelon.sport.repository;

import com.akvelon.sport.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
