package org.example.lifecycle.annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Patient
{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside the setter method");
        this.id = id;
    }

    @PostConstruct
    public void initMethod()
    {
        System.out.println("Inside init method");
    }

    @PreDestroy
    public void destroyMethod()
    {
        System.out.println("Inside destroy method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
