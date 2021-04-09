package br.com.oatsolutions.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    private MyRepository repository;

    public void doSomething() {
        System.out.println("Doing something important");
        repository.doQuery();
    }
}
