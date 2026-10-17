package currencyconverter;

import java.util.HashMap;
import java.util.Map;
public class CurrencyConverter {
    private static final Map<String, Double> RATES = new HashMap<>();
    static{
        RATES.put("USD", 1.0);       // Доллар США (базовая валюта)
        RATES.put("EUR", 0.92);      // Евро
        RATES.put("RUB", 92.50);     // Российский рубль
        RATES.put("GBP", 0.79);      // Фунт стерлингов
        RATES.put("JPY", 149.80);    // Японская йена
        RATES.put("CNY", 7.24);      // Китайский юань
        RATES.put("KZT", 465.00);    // Казахстанский тенге
        RATES.put("UAH", 41.30);     // Украинская гривна
        RATES.put("BYN", 3.27);      // Белорусский рубль
        RATES.put("TRY", 34.20);     // Турецкая лира
    }
    public double convert(String fromCurr, String toCurr, double count){
        fromCurr = fromCurr.toUpperCase();
        toCurr = toCurr.toUpperCase();
        if(count < 0){
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }
        if(!RATES.containsKey(fromCurr) || !RATES.containsKey(toCurr)){
            throw new IllegalArgumentException("Введена неверная валюта");
        }
        return count/RATES.get(fromCurr)*RATES.get(toCurr);
    }
}
