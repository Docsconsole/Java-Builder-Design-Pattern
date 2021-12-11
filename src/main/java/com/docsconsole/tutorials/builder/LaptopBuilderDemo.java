package com.docsconsole.tutorials.builder;

public class LaptopBuilderDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder().processor("Intel Core I5").ram(4).storage("SSD").capacity(500).build();
        System.out.println(laptop);
    }
}
