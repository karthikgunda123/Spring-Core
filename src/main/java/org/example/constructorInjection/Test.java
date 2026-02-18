package org.example.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructoInjection.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
