package com.teksystems.employees;

public class InheritanceActivity
{
    public void run()
    {
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        System.out.println(manager.calculateSalary());

        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.println(trainee.calculateSalary());

        System.out.println(manager.calculateTransportAllowance());

        System.out.println(trainee.calculateTransportAllowance());
    }
}
