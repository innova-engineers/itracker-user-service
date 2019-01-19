package com.innova.userservice.service;

import com.innova.userservice.beans.User;

public interface UserService {

    User findByEmail(String email);
}
