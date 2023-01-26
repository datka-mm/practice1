package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Random random = new Random();
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        String empty = " ";
//        for (int i = 0; i < number; i++) {
//            for (int j = number - i; j > 0; j--) {
//                System.out.print(empty);
//                if (j == number) {
//                    for (int k = 0; k < j - 2; k++) {
//                        System.out.print(empty);
//                    }
//
//                    System.out.print("@#");
//                }
//            }
//
//            if (i == 0) {
//                System.out.println("");
//            } else {
//                System.out.println("#");
//            }
//        }

       int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }

        System.out.println("Arrays value: " + Arrays.toString(array));
        System.out.println(maxNumber(array));

    }

    public static int maxNumber(int[] array) {
        int max = 0;
        int arrayNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arrayNumber) {
                max = array[i];
                arrayNumber = array[i];
            }
        }

        return max;
    }
}