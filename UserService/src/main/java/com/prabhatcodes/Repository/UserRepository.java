package com.prabhatcodes.Repository;

import com.prabhatcodes.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // if you want to implement any custom method and query then you can implement here

}
