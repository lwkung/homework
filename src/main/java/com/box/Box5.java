package com.box;

public class Box5 extends Box{

    @Override
    public boolean validate(float length, float width, float height) {
        return length < 39.5f && width < 27.5f && height < 23f;
    }

}
