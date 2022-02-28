package com.teksystems.employees;

public class Employee
{
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
    public long employeePhone;
    public double basicSalary;
    public double specialAllowance = 250.80;
    public double hra = 1000.50;

    public Employee()
    {

    }

    public Employee(long id, String name, String address, long phone)
    {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }

    public double calculateSalary()
    {
        double salary;

        salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);

        return salary;
    }

    public double calculateTransportAllowance()
    {
        double transportAllowance;

        transportAllowance = (double)10 / 100 * basicSalary;

        return transportAllowance;
    }
}
