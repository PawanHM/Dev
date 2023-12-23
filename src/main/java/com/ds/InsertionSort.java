package com.ds;

import java.util.*;
import java.util.stream.Collectors;

public class InsertionSort {
    public  synchronized static void main(String... args) {
        Integer[] a = {5,1,6,2,4,3,1,2,3,6,5,5};
        InsertionSort obj = new InsertionSort();
        obj.getAvg(a);
        obj.getAdd(a);
        obj.getAvgIf(a);
        obj.evenAndOdd(a);
        obj.findDuplicate(a);
        obj.secondH(a);
    }

    private void secondH(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        Integer sndH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println("Second Highest "+sndH);
    }

    private void findDuplicate(Integer[] a) {
       List<Integer> list = Arrays.asList(a);
       Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println("dup "+dup);
        System.err.print("hello");
    }

    private void evenAndOdd(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        List<Integer> even = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println("even "+even);
        List<Integer> odd = list.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
        System.out.println("odd "+odd);
    }

    public void getAvgIf(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        double d = list.stream().map(x -> x*x).mapToInt(s -> s).filter(x -> x>10).average().getAsDouble();
        System.out.println("final Data "+d);
    }
    public void getAvg(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        double avg = list.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println("avg "+avg);
    }

    public void getAdd(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        Optional<Integer>  data = list.stream().reduce((c, b) -> c+b);
        System.out.println("data " +data.get());
    }
}
