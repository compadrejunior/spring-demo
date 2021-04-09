package br.com.oatsolutions.spring;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
    public void doQuery(){
        System.out.println("Doing some query");
    }
}
