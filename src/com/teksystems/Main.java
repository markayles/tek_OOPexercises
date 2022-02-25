package com.teksystems;

import com.teksystems.employees.*;
import com.teksystems.monsters.*;

public class Main
{
    public static void main(String[] args)
    {
        TestMonster testMonster = new TestMonster();
        testMonster.run();

        InheritanceActivity inheritanceActivity = new InheritanceActivity();
        inheritanceActivity.run();
    }
}
