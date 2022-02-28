package com.teksystems.employees;

public class Manager extends Employee
{
    public Manager(long id, String name, String address, long phone, double salary)
    {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }

    @Override
    public double calculateTransportAllowance()
    {
        double transportAllowance;

        transportAllowance = (double)15 / 100 * basicSalary;

        return transportAllowance;
    }
}
