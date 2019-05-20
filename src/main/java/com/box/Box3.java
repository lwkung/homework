package com.box;

public class Box3 extends Box {

    @Override
    public boolean validate(float length, float width, float height) {
        return length < 23f && width < 14f && height < 13f;
    }

}
