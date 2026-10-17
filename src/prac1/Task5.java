package prac1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого нужно найти");
        long num = facktorial(sc.nextLong());
        System.out.println(num);
    }
    public static long facktorial(long a){
        for (long i = a-1; i > 0; i--){
            a *= i;
        }
        return a;
    }
}
