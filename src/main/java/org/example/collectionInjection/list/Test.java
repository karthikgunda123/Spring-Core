package org.example.collectionInjection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ListSI.xml");
        Hospital hospital = (Hospital) applicationContext.getBean("hospital");
        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartments());
    }
}
