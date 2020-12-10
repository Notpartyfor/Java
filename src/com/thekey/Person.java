package com.thekey;

public class Person {
    protected String name;
    protected int age;

    public static int count;
    public static int getCount() {
        return count;
    }

    public Person() {
        count+=2;
    }
}

class Thekey extends Person