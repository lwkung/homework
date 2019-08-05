package com.stream;

public class Box {

    String name;
    float length;
    float width;
    float height;

    public Box(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static Box getBox(float length, float width, float height) {
        Box box3 = new Box3();
        Box box5 = new Box5();
        if (box5.validate(length, width, height)) {
            return box5;
        } else {
            return box3;
        }
    }

    public boolean validate(float length, float width, float height) {
        if (this.length >= length && this.width >= width && this.height >= height)
            return true;
        return false;
    }
}
