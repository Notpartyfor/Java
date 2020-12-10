package com.company;

public class Person {
    protected String name;
    protected int age;

    public static int count;

    public static int getCount() {
        return count;
    }

    public Person() {
        count++;
    }
}

class Thekey extends Person {
    public Thekey() {
        super();
    }
}