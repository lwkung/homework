package com.stream;

public class BoxTester {
    public static void main(String[] args) {
        float length = 8f;
        float width = 15f;
        float height = 8f;
        Box box = Box.getBox(length,width,height);
        System.out.println(box.name);
    }
}
