package com.innova.userservice.repository;

import com.innova.userservice.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
