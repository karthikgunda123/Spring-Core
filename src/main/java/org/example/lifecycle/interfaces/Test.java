package org.example.lifecycle.interfaces;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    static void main() {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("InterfaceLC.xml");
        Patient patient = (Patient) applicationContext.getBean("patient");
        System.out.println(patient);
        // to initiate the destroy method we must use AbstractApplicationContext or ConfigurableApplicationContext instead of ApplicationContext
        applicationContext.registerShutdownHook();
    }
}