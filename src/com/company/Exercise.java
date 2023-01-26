package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //  int number = random.nextInt(10, 30);
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i != 1; ) {
//            System.out.println("Birinchi san : ");
//            int num1 = scanner.nextInt();
//            System.out.println("Ekinchi san : ");
//            int num2 = scanner.nextInt();
//            System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
//            System.out.println("hotite prodolzhit ili net");
//            i = scanner.nextInt();
//        }
//        int a=0;
//        while (a<=10){
//            a++;
//            System.out.println("введите 2 число");
//            int v= scanner.nextInt();
//            int n= scanner.nextInt();
//            System.out.printf("%d*%d=%d\n",v,n,(v*n));
//            System.out.println("надо ли завершит?");
//            int m= scanner.nextInt();
//            if (m==1){
//                System.out.println("все!");
//                break;
//            }
//        }
//        int k = 0;
//        while (k < 3) {
//            //внутренние циклы те же, что и выше
//            for (int i = 1; i <= 5; i ++) { // переменная i отсчитывает строки
//                for (int j = 0; j < i; j ++) { // печатаем букву i раз
//                    System.out.print ('a'); // печатаем 'a' без пробелов
//                }
//                System.out.println (); //поставить enter для новой строчки
//            }
//            k ++;
//        }
//        int k = 0;
//        while (k < 3) {
//            //внутренние циклы те же, что и выше
//            for (int i = 1; i <= 5; i ++) { // переменная i отсчитывает строки
//                for (int j = 0; j < i; j ++) { // печатаем букву i раз
//                    System.out.print ('a'); // печатаем 'a' без пробелов
//                }
//                System.out.println (); //поставить enter для новой строчки
//            }
//            k ++;
//        }

//        int b = 0;
//        do {
//            b++;
//            int k = 5;
//            for (int i = 1; i <= k; i++) {
//                for (int j = i; j <= k; j++) {
//                    System.out.print(" ");
//                }
//
//                for (int j = i; j > 1; j--) {
//                    System.out.print(j);
//                }
//
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(j);
//                }
//
//                System.out.println();
//
//            }
//
//            int x = 1;
//
//            for (int a = 4; a >= x; a--) {
//                for (int v = 5; v >= a; v--) {
//                    System.out.print(" ");
//                }
//            }
//        }
//        while (b < 3);
//    }
//}
//

//            for (int v = a; v > 1; v--) {
//                System.out.print(v);
//            }
//            for (int v = 1; v <= a; v++) {
//                System.out.print(v);
//            }


//        while(true) {
//            System.out.println("Введите свое имя");
//            String name = scanner.nextLine();
//            System.out.println(name + " пожалуйста, выберите билет от 1 до 12");
//            int firstTicketNumber = scanner.nextInt();
//            if (firstTicketNumber == 7) {
//                System.out.println(name + " поздравляю у вас счастливый билет");
//            } else if (firstTicketNumber == 2) {
//                System.out.println(name + " поздравляю у вас счастливый билет");
//            } else if (firstTicketNumber == 11) {
//                System.out.println(name + " поздравляю у вас счастливый билет");
//            } else {
//                System.out.println(name + " у вас обычной билет");
//            }
//
//            System.out.println(name + " пожалуйста, выберите билет от 1 до 12");
//            int secondTicketNumber = scanner.nextInt();
//            if (firstTicketNumber == secondTicketNumber) {
//                System.out.println("этот билет вы уже выбрали прошли раз, выберите другой билет");
//            } else {
//                if (firstTicketNumber == 7) {
//                    System.out.println(name + " поздравляю у вас счастливый билет");
//                } else if (firstTicketNumber == 2) {
//                    System.out.println(name + " поздравляю у вас счастливый билет");
//                } else if (firstTicketNumber == 11) {
//                    System.out.println(name + " поздравляю у вас счастливый билет");
//                } else {
//                    System.out.println(name + " у вас обычной билет");
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println();
//            for (int k = 5; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 + 1; j++) {
//                System.out.print("a");
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println();
//            for (int k = 5; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 + 1; j++) {
//                System.out.print("a");
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println();
//            for (int k = 5; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 + 1; j++) {
//                System.out.print("a");
//            }
//        }
//    }
//}

//        for (int i = 6; i >0; i-- ) {
//            for ( int j = i ; j > 0 ; j-- )
//                System.out.print("*");
//            System.out.println();
//        }

//        System.out.println("Vvedite 2 chisla");
//        int y = scanner.nextInt();
//        int yy = scanner.nextInt();
//        System.out.println(y*yy);
//        int yyy = scanner.nextInt();
//        while (yyy>1){
//            System.out.println("Vvedite 2 chisla");
//            int w = scanner.nextInt();
//            int ww = scanner.nextInt();
//            System.out.println(w*ww);

        }
    }
