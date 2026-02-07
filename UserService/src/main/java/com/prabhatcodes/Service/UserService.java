package com.prabhatcodes.Service;


import com.prabhatcodes.Entity.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface UserService {

    // user operations totally scalable

    // create user
    User createUser(User user);

    // get all user
//    List<User> getAllUser();
    Page<User> getAllUser(int page, int size);

    // get user by ID
//    Optional<User> getById(String userId);
    User getUserById(String userId);

    // delete user by id
    boolean deleteUserById(String userId);
//    User deleteById(String userId);

    // delete all users
    List<User> deleteAllUsers();

    // update user
    User updateUser(User user, String userId);

}
