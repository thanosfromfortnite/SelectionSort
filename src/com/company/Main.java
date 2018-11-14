package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] stuff = {4, 7547, 92, 581, 385, 62, 18, 0, 347, 184, 52, 33};
	    selectionSort(stuff);
	    for (int i = 0; i < stuff.length; i ++) {
	        System.out.println(stuff[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i; j < arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
