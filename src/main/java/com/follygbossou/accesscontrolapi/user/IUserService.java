package com.follygbossou.accesscontrolapi.user;

import com.follygbossou.accesscontrolapi.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getUsers();

    User registerUser(RegistrationRequest request);

    Optional<User> findByEmail(String email);

 }
