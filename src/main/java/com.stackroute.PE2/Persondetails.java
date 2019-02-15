package com.stackroute.PE2;



public class Persondetails {

    private String name;
    private int age;
    private double salary;

    public Persondetails(String name,int age,double salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;


//        complete the code

    }
    public String details()
    {
        String result="Member Name: "+this.name+"\n" +
                "Member age:"+age +"\n" +
                "Member salary:"+salary+"";
        return result.trim();
    }

}