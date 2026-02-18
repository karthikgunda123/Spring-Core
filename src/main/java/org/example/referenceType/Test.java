package org.example.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ReferenceTypeSI.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
