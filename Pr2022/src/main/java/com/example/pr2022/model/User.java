package com.example.pr2022.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
@Getter
@Setter
@Accessors
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer iduser;

    @Column(name = "login", nullable=false)
    private String login;

    @Column(name = "password", nullable=false)
    private String password;
}
