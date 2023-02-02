package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
        return new Person("Tom", 20, new Address("47-40 Metropolitan", "New York"));
    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
    @Bean(name = "whatEverIWantTheNameToBe")
    public Address address() {
        return new Address("153 Windsor Rd", "Asheville");
    }
}
