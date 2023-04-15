package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("Shamim");
        String name = rwOnly.getName();
        System.out.println(name);
    }
}