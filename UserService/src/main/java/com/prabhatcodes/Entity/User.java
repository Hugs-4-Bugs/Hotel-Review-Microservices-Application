package com.prabhatcodes.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


//@Data   // you can use only @Data which includes @Getter, @Setter, @AllArgsConstructor & @NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="user")

public class User {

    @Id
    @Column(name= "ID")
    private String userId;

    // Or if you want to generate UUID yourself (manual)
    /**
     * @Id
     * @Column(name = "ID", updatable = false, nullable = false)
     * private String userId;
     */


    // Or if you want to generate the unique userId automatically then use
    /**
     * @Id
     * @Column(name = "ID", updatable = false, nullable = false)
     * @@GeneratedValue(strategy = GenerationType.IDENTITY)
     * private Long userId
     */


    @Column(name="NAME", length = 20)
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT", length = 250)
    private String about;
    // other fields can be also initialized as per requirement


    // this will return ratings=[];
    @Transient
    private List<Rating> ratings = new ArrayList<>();

    /**
     * // this will return ratings=null;
     * @Transient
     * private List<Rating> ratings;
     */


}
