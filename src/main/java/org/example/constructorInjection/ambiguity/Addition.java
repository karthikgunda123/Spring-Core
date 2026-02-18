package org.example.constructorInjection.ambiguity;

public class Addition {

    Addition(int a, double b){
        System.out.println("Inside the constructor");
        System.out.println(a + " " + b);
    }

}
