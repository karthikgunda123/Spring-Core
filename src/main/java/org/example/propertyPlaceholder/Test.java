package org.example.propertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanExternalization.xml");
        MyDao myDao = (MyDao) applicationContext.getBean("myDao");
        System.out.println(myDao);
    }
}
