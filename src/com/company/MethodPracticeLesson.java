package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodPracticeLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        String num = number + "";
        int number1 = 0;
        int number2 = 0;
        char[] charArray = num.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
            if (i == 1) {
                number1 = charArray[i];
                System.out.println("Number1 " + number1);
            } else if (i == 0) {
                System.out.println("number2 " + number2);
                number2 = charArray[i];
            }

        }

        String reverse = number1 + "" + number2;
        System.out.println("Reverse: " + reverse);
        int parsed = Integer.parseInt(reverse);
        System.out.println("Parsed: " + parsed);
        int sum = parsed + 8;
        System.out.println(sum);
    }

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = randomNumber(5, 10);
//        }
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static int randomNumber(int a, int b) {
//        Random random = new Random();
//        int number = random.nextInt(a, b);
//        return number;
//    }
}
