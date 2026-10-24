package org.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class Person {

    private String name;
    private String domain;
    private String role;
    private String bio;
    private String email;
    private String phone;
    private String address;
    private String gitHub;
    private String linkedIn;

}
