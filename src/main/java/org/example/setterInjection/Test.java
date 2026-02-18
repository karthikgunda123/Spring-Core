package org.example.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SetterInjection.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
