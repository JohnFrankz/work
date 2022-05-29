package com.duckburrito.len.debug_;

import java.util.Arrays;
import java.util.Objects;

public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {8, -1, 199, 70, 10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println("hello 100");
        System.out.println("hello 200");
        System.out.println("hello 300");
        System.out.println("hello 400");
        System.out.println("hello 500");
        System.out.println("hello 600");
    }
}
