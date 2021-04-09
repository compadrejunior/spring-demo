package br.com.oatsolutions.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "application-context.xml");
        MyService service = ctx.getBean(MyService.class);
        service.doSomething();
    }
}
