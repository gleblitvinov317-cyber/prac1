package prac1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int length = sc.nextInt();
        String str = sc.nextLine();
        for (int i = 0; i < length; i++){
            str = sc.nextLine();
            System.out.println(str);
        }
    }
}
