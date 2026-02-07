package com.prabhatcodes.Controller;

import com.prabhatcodes.Entity.User;
import com.prabhatcodes.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;



    // create user
    @PostMapping(path = "/create")
    public ResponseEntity<User> createUser(@RequestBody(required = true) User user){
        User user1 = userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    // get user by user id
    @GetMapping(path = "/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User user = userService.getUserById(userId);
            return ResponseEntity.ok(user);
    }

/**
    // get all user
//    @GetMapping(path = "/getAllUsers")
//    public ResponseEntity<List<User>> getAllUser(){
//        List<User> allUser = userService.getAllUser();
//        try{
//            return ResponseEntity.ok(allUser);
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
*/

// This method is scalable and using the pagination for faster retrival of data
    @GetMapping("/getAllUsers")
    public ResponseEntity<Page<User>> getAllUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Page<User> allUser = userService.getAllUser(page, size);
            return ResponseEntity.ok(allUser);
    }

}
