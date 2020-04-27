package com.toufupig.first;

import com.sun.tools.javac.util.StringUtils;

public class HelloWorld {

    private String name;
    private String address;

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("aaa");
        helloWorld.setAddress("hangzhou");
        System.out.println(StringUtils.toUpperCase("apple"));
        System.out.println(helloWorld);
        System.out.println("Today is my birthday!");
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public HelloWorld(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public HelloWorld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
