package org.example.lifecycle.xml;

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

    public void initMethod()
    {
        System.out.println("Inside init method");
    }

    public void destroyMethod()
    {
        System.out.println("Inside Destroy method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
