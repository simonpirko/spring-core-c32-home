package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
//        System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
        User user = (User) app.getBean("user");
//        user.test();
        System.out.println(user);
//        user.setBeanName("guest");
//
//        System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
        app.close();
//        Dog dog = (Dog) app.getBean("dog");
//        Cat cat = (Cat) app.getBean("cat");
//        User user = (User) app.getBean("user");
//        System.out.println(cat == user.getCat());
//        System.out.println(user);

//        System.out.println(dog);
//        System.out.println(cat);
//        User user = (User)app.getBean("user");
//        user.sayHello();
//        Thread.sleep(50000);
//        System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
//        app.close();
    }

    //xml
    //Annotation
    //Java base

    //Constr
    //Autowired annotation
    //Setter
}
