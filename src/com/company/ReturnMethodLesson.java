package com.company;

import java.util.Random;

public class ReturnMethodLesson {
    public static void main(String[] args) {
        Random random = new Random();
        String[] students = new String[3];
        students[0] = "Datka";
        students[1] = "Ulan";
        students[2] = "Ainazik";

        int[] tickets = new int[25];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = i += 1;
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < 3; j++) {
                int ticket1 = random.nextInt(1, 25);
                int ticket2 = random.nextInt(1, 25);
                int ticket3 = random.nextInt(1, 25);
                if (tickets[i] == ticket1 || tickets[i] == ticket2 || tickets[i] == ticket3) {
                    tickets[i] = 0;
                }
                System.out.println(students[i] + " choose tickets: " + ticket1 + ", " + ticket2 + ", " + ticket3);
            }
        }


    }

//        Scanner scanner=new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b=(a%10);
//        int c=(a%100/10);
//        String number = b + "" + c;
//        System.out.println("String number soz: " + number + 8);
//        int parse = Integer.parseInt(number);
//        System.out.println("parsed: " + parse);
//        System.out.println(parse + 8);

//        Scanner scanner = new Scanner(System.in);
//        task5(0);
//    }
//
//    static void task5 (int num){
//        Scanner in = new Scanner(System.in);
//        int num1 = 0;
//        int num2 = 0;
//        num = in.nextInt();
//        while (num>=1){
//            num1 = num%10;
//            num2 = num2 * 10 + num1;
//            num = num / 10;
//        }
//
//        System.out.println(num2);
//        System.out.println(num2+8);
//    }
//        int a = 1;
//        int b =20;
//        int[] num =new int[20];
//        for (int i=0;i< num.length;i++){
//            num[i] = task4(a, b);
//            System.out.print(num[i]+" ");
//        }
//    }
//
//    static int task4(int a,int b){
//        Random random = new Random();
//        int c = random.nextInt(a,b);
//        return c;
//    }
}
