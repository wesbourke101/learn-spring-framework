package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.StandardSocketOptions;

public class App01HelloWorldSpring {
    public static void main(String[] args) {
        //launch spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //Configure the things we want spring to manage

        //retrieving Beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Address.class));
    }
}
