package org.example;



import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the name of children: ");
        String name=sc.next();
        System.out.println("Enter the age of children: ");
        int age=sc.nextInt();
        Child child1=new Child(name,age);
        System.out.println("Enter the name of children: ");
        name=sc.next();
        System.out.println("Enter the age of children: ");
        age=sc.nextInt();
        Child child2=new Child(name,age);

        System.out.println("Enter the name of chocolate: ");
        String chocoName=sc.next();
        System.out.println("Enter the weight of chocolate: ");
        int chocoWeight=sc.nextInt();
        System.out.println("Enter the calories in chocolate: ");
        int chocoCalories=sc.nextInt();
        System.out.println("Enter the price of chocolate: ");
        int chocoPrice=sc.nextInt();
        Sweets chocolateA=new Choco(chocoName,chocoWeight,chocoCalories,chocoPrice);

        System.out.println("Enter the name of chocolate: ");
        chocoName=sc.next();
        System.out.println("Enter the weight of chocolate: ");
        chocoWeight=sc.nextInt();
        System.out.println("Enter the calories in chocolate: ");
        chocoCalories=sc.nextInt();
        System.out.println("Enter the price of chocolate: ");
        chocoPrice=sc.nextInt();
        Sweets chocolateB=new Choco(chocoName,chocoWeight,chocoCalories,chocoPrice);

        System.out.println("Enter the name of cake: ");
        String cakeName=sc.next();
        System.out.println("Enter the weight of cake" );
        int cakeWeight=sc.nextInt();
        System.out.println("Enter the calories in cake: ");
        int cakeCalories=sc.nextInt();
        System.out.println("Enter the price of cake: ");
        int cakePrice=sc.nextInt();
        Sweets cakeA=new Cake(cakeName,cakeWeight,cakeCalories,cakePrice);

        System.out.println("Enter the name of cake: ");
        cakeName=sc.next();
        System.out.println("Enter the weight of cake: ");
        cakeWeight=sc.nextInt();
        System.out.println("Enter the calories in cake: ");
        cakeCalories=sc.nextInt();
        System.out.println("Enter the price of cake: ");
        cakePrice=sc.nextInt();
        Sweets cakeB=new Cake(cakeName,cakeWeight,cakeCalories,cakePrice);

        System.out.println("Enter the name of candy: ");
        String candyName=sc.next();
        System.out.println("Enter the weight of candy: ");
        int candyWeight=sc.nextInt();
        System.out.println("Enter the calories in candy: ");
        int candyCalories=sc.nextInt();
        System.out.println("Enter the price of candy: ");
        int candyPrice=sc.nextInt();
        Sweets candyA=new Candy(candyName,candyWeight,candyCalories,candyPrice);

        System.out.println("Enter the name of candy: ");
        candyName=sc.next();
        System.out.println("Enter the weight of candy: ");
        candyWeight=sc.nextInt();
        System.out.println("Enter the calories in candy: ");
        candyCalories=sc.nextInt();
        System.out.println("Enter the price of candy: ");
        candyPrice=sc.nextInt();
        Sweets candyB=new Candy(candyName,candyWeight,candyCalories,candyPrice);


        Vector<Sweets> a1=new Vector<Sweets>();
        a1.add(chocolateA);
        a1.add(cakeA);
        a1.add(candyA);
        Vector<Sweets> a2=new Vector<Sweets>();
        a2.add(chocolateB);
        a2.add(cakeB);
        a2.add(candyB);
        Gift giftA=new Gift(a1,"Happy New Year");
        Gift giftB=new Gift(a2,"lots of wishes");
        child1.give(giftA,child1);
        child2.give(giftB,child2);
        child1.show();
        child2.show();
    }
}