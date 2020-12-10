package com.company;

public class Main {
    public static void main(String[] args) {
        com.thekey.Person p1 = new com.thekey.Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        System.out.println(Person.getCount());
        System.out.println(com.thekey.Person.getCount());
    }
}

