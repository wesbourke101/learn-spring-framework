package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Wes";
    }
    @Bean
    public int age() {
        return 33;
    }
    @Bean
    public Person person() {
        return new Person("Tom", 20);
    }
    @Bean(name = "whatEverIWantTheNameToBe")
    public Address address() {
        return new Address("153 Windsor Rd", "Asheville");
    }
}
