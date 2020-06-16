package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@ThisDog
public class User {
//    private String myName;

//    @Autowired
//    private Cat cat;
    @Autowired
    private Dog dog2;

//    @Autowired
//    private ApplicationContext applicationContext;

//    private ApplicationContext applicationContext2;

//    public void test(){
//        System.out.println(applicationContext.equals(applicationContext2));
//    }

//    public User(Cat cat, Dog dog) {
//        this.cat = cat;
//        this.dog = dog;
//    }
//
//    public User(Cat cat) {
//        this.cat = cat;
//    }

//    @PostConstruct
//    public void init(){
//        System.out.println("inti");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy");
//    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.dog = (Dog) beanFactory.getBean("dog");
//    }

//    @Override
//    public void setBeanName(String s) {
//        this.myName = s;
//    }

//    public void sayHello(){
//        System.out.println("Hello!");
//    }
//
//    public Cat getCat() {
//        return cat;
//    }
//
    @Override
    public String toString() {
        return "User{" +
//                "cat=" + cat +
                ", dog=" + dog2 +
                '}';
    }

//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext2 = applicationContext;
//    }
}
