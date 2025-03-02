package com.user.userservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "user_id")
    private String user_id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "about")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
