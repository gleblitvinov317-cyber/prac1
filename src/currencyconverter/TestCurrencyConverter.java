package currencyconverter;

import java.util.Scanner;
public class TestCurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();
        String fromCurr = sc.nextLine();
        String toCurr = sc.nextLine();
        double count = sc.nextDouble();
        try {
            System.out.println(cc.convert(fromCurr, toCurr, count));
        }catch (IllegalArgumentException e){
            System.err.println("Ошибка: " + e);
        }
    }
}
