package com.prosky.fundamentalsalgorithmspart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class FundamentalsAlgorithmsPart2Application {
//    private static void swapElements(int[] arr, int indexA, int indexB) {
//        int tmp = arr[indexA];
//        arr[indexA] = arr[indexB];
//        arr[indexB] = tmp;
//    }
//// Сортировка вставкой
//    public static void insertionSort(int[] arrays) {
//        for (int i = 0; i < arrays.length; i++) {
//            int temp = arrays[i];
//            int j = i;
//            while (j > 0 && arrays[j - 1] >= temp) {
//                arrays[j] = arrays[j - 1];
//                j--;
//            }
//            arrays[j] = temp;
//        }
//    }
//// Пузырьковая сортировка
//    public static void sortBubble(int[] arrays1) {
//        for (int i = 0; i < arrays1.length - 1; i++) {
//            for (int j = 0; j < arrays1.length - 1 - i; j++) {
//                if (arrays1[j] > arrays1[j + 1]) {
//                    swapElements(arrays1, j, j + 1);
//                }
//            }
//        }
//    }
//    //Сортировка выбором
//    public static void sortSelection(int[] arrays2) {
//        for (int i = 0; i < arrays2.length - 1; i++) {
//            int minElementIndex = i;
//            for (int j = i + 1; j < arrays2.length; j++) {
//                if (arrays2[j] < arrays2[minElementIndex]) {
//                    minElementIndex = j;
//                }
//            }
//            swapElements(arrays2, i, minElementIndex);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(FundamentalsAlgorithmsPart2Application.class, args);
//        Random random = new Random();
//        int[] arr = new int[100_000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }
//        int[] arr1 = Arrays.copyOf(arr, arr.length);
//        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        int[] arr3 = Arrays.copyOf(arr, arr.length);
//        int[] arr4 = Arrays.copyOf(arr, arr.length);
//        long start = System.currentTimeMillis();
//        insertionSort(arr);
//        long time = System.currentTimeMillis() - start;
//        System.out.println("Время сортировки - " + time);
//        insertionSort(arr1);
//        long time1 = System.currentTimeMillis() - start;
//        System.out.println( "Dремя сортировки методом Пузырьковая сортировка - " + time1);
//        insertionSort(arr2);
//        long time2 = System.currentTimeMillis() - start;
//        System.out.println("Время сортировки методом Сортировка выбором - " + time2);
//    }


}


