package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@ThisDog
public class Dog {

    @Value("dogName")
//    @Autowired
    private String dogName;

    @Value("22")
    private int age;

//    public Dog(@Value("test dog") String dogName) {
//        this.dogName = dogName;
//    }

    @Override
    public String toString() {
        return "Dog{" +
                age +
                "name='" + dogName + '\'' +
                '}';
    }
}
