package org.example.lifecycle.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main() {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationsLC.xml");
        Patient patient = (Patient) applicationContext.getBean("patient");
        System.out.println(patient);
        // to initiate the destroy method we must use AbstractApplicationContext or ConfigurableApplicationContext instead of ApplicationContext
        applicationContext.registerShutdownHook();
    }
}