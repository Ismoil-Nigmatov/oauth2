package com.bakhriddin.oauth_2_0.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    // One entity for Google account and Github account
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String given_name;
    private String picture; // img url
    private String type;    // user, admin
    private String email;   // @gmail
    private String login;   // login name
    private String bio;     // bio
    private String avatar_url; // profile picture
    private String url;     // user link

}
