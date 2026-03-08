package com.example.demo.java8;

@FunctionalInterface
interface MyfunctionalInterface {
void greet(String name);
}

public class FunctionalInterfaceExample {
public static void main(String[] args)
{
MyfunctionalInterface greet = name -> System.out.println("Hello,"+name);
greet.greet("Alice");
}
}
