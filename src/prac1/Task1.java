package prac1;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        int [] b = new int[a];
        for (int i = 0; i < a; i++){
            b[i] = sc.nextInt();
            ans += b[i];
        }
        System.out.println("Сумма элементов массива = " + ans);
        System.out.println("Среднее арифметическое = " + (double) ans/a);
    }


}
