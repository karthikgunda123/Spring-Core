package org.example.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ambiguityCI.xml");
        applicationContext.getBean("addition");
    }
}
