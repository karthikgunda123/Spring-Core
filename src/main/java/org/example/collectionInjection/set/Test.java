package org.example.collectionInjection.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SetSI.xml");
        CarDealer carDealer = (CarDealer) applicationContext.getBean("carDealer");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels());
        System.out.println(carDealer.getModels().getClass().getName());
    }
}