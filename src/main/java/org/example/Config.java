package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {

    public Config() {
        System.out.println("Config constr");
    }

    //    @Bean
//    public String catName(){
//        return "test cat";
//    }

    @Bean(autowireCandidate = false)
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Dog dog2(){
        return new Dog();
    }


//    @Bean
//    public String dogName(){
//        return "test dog";
//    }

//    @Bean
//    public Cat cat(String catName){
//        return new Cat(catName);
//    }


//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public User user(){
//        return new User();
//    }
}
