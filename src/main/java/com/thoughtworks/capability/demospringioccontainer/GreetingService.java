package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Service
@Scope(value = "prototype")
//@Scope(SCOPE_SINGLETON)
public class GreetingService {
    public GreetingService(){
        System.out.println("+++++++++++Greeting service is initing");
    }
    String sayHi() {
        return "hello world";
    }
}
