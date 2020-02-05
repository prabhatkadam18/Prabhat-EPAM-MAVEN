package org.example;

import java.util.*;

public class Child {
    String name;
    int age;
    Vector<Gift> gifts=new Vector<Gift>();

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void give(Gift g,Child c)
    {
        c.take(g);
    }
    public void take(Gift g)
    {
        gifts.add(g);
    }
    public void show()
    {
        System.out.print(this.name+": ");
        for(Gift g:gifts)
        {
            System.out.println(g.sl+" Total Weight=" + g.totalWeight()+"g Message="+g.message);
        }
    }
}