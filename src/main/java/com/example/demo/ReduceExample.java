package com.example.demo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Optional<Integer> output = Arrays.asList(arr).stream().reduce((a, b) -> a*b);
        if (output.isPresent())
            System.out.println(output.get());
    }
}
