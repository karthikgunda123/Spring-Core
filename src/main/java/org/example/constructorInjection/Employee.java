package org.example.constructorInjection;

public class Employee
{
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
