package com.examplemenon.userbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Users") //Tells which table to map to, where the deafult would be the same name as the class
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "User Name")
    private String username;
    @Column(name = "Name")
    private String name;
    @Column(name = "Email Id")
    private String email;

    public User () {

    }

    public User(String username, String name, String email) {
        this.username=username;
        this.name=name;
        this.email=email;
    }

}
