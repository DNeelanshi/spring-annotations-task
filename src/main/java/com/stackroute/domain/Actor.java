package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("Neelanshi")
    private String name;

    @Value("23")
    private int age;

    @Value("female")
    private String gender;


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


}
