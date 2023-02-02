package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01HelloWorldSpring {
    public static void main(String[] args) {
        //launch spring context
        try(var context =
                    new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
                        {
                            System.out.println(context.getBean("name"));
                            System.out.println(context.getBean("age"));
                            System.out.println(context.getBean("person"));
                            System.out.println(context.getBean("person2MethodCall"));
                            System.out.println(context.getBean(Address.class));
                        };
    }
}
