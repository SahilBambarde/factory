package org.example;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android Developer salary getting");
        return 50;
    }
}
