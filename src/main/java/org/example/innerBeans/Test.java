package org.example.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("InnerBeans.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) applicationContext.getBean("employee");
        System.out.println(employee2.hashCode());
    }
}
