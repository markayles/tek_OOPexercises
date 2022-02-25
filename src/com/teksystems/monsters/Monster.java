package com.teksystems.monsters;

public class Monster
{
    private String name;

    public Monster()
    {
        this("No name");
    }

    public Monster(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String attack()
    {
        return "@#$@% I don't know how to attack!";
    }
}
