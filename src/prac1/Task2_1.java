package prac1;

import java.util.Scanner;

public class Task2_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = sc.nextInt();
        int [] b = new int [length];
        int i = 0;
        int min = 10000;
        int max = 0;
        do{
            b[i] = sc.nextInt();
            if (b[i] < min){
                min = b[i];
            }
            if (b[i] > max){
                max = b[i];
            }
            i++;
        }while (i < length);
        System.out.println("Минимальное число массива = " + min);
        System.out.println("Максимальное число массива = " + max);
    }
}
