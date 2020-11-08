package com.thoughtworks.capability.demospringioccontainer;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    System.out.println("-------------initing GreetingService");
    String sayHi() {
        return "hello world";
    }
}
