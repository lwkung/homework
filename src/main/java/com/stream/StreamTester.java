package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        float length = 8;
        float width = 15;
        float height = 8;
        Stream<Box> stream = Stream.<Box>builder()
                .add(new Box("Box3", 23, 14, 13))
                .add(new Box("Box5", 39.5f, 27.5f, 23))
                .build();
        List<Box> list = stream.filter(box ->
                box.length >= length && box.width >= width && box.height >= height
        ).collect(Collectors.toList());
        for (Box box : list) {
            System.out.println(box.name);
        }
    }
}
