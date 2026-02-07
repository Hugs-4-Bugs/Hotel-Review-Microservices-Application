package com.prabhatcodes.Service.Impl;

import com.prabhatcodes.Entity.User;
import com.prabhatcodes.Exceptions.ResourceNotFoundException;
import com.prabhatcodes.Repository.UserRepository;
import com.prabhatcodes.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public User createUser(User user) {
        UUID randomUserId = UUID.randomUUID(); // this will generate an unique user id
        user.setUserId(String.valueOf(randomUserId));
        return userRepository.save(user);
    }


    // And to generate UUID manually

    /**
     *
     @Override
     public User createUser(User user) {
     UUID randomUserId = UUID.randomUUID(); // this will generate an unique user id
     user.setUserId(randomUserId);
     return userRepository.save(user);
     }

     */


//    @Override
//    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }


    /** Controller defines pagination explicitly */
//    @GetMapping("/users")
//    public ResponseEntity<Page<User>> getAllUsers(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int size) {
//        return ResponseEntity.ok(userService.getAllUser(page, size));
//    }


    /** Implementation uses DB-level pagination (DB level Pagination) */
    @Override
    public Page<User> getAllUser(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable);
    }


    /**
      public Optional<User> getById(String userId) {
          return userRepository.findById(userId);
      }
     */

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + userId));
    }

    @Override
    public boolean deleteUserById(String userId) {
        return false;
    }

    @Override
    public List<User> deleteAllUsers() {
        return null;
    }

    @Override
    public User updateUser(User user, String userId) {
        return null;
    }

}
