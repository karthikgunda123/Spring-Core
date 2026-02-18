package org.example.collectionInjection.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("PropertiesSI.xml");
        Languages languages = (Languages) applicationContext.getBean("languages");
        System.out.println(languages);
    }
}
