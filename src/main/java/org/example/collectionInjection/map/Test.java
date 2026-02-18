package org.example.collectionInjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MapSI.xml");
        Customer customer = (Customer) applicationContext.getBean("customer");
        System.out.println(customer);
    }
}
