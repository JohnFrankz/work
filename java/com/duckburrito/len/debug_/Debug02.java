package com.duckburrito.len.debug_;

import jdk.nashorn.api.tree.ForInLoopTree;

import java.util.Arrays;

public class Debug02 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {8, -1, 199, 70, 10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("exit for");
    }
}
