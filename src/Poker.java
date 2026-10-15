import java.util.*;

public class Poker {
    private static final String[] Suits = {"♠","♥","♦","♣"};
    private static final String[] Numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        if (players <= 0 || players > 10){
            System.out.println("Введено некорректное количество игроков");
            sc.close();
            return;
        }
        List<String> deck = createdeck();
        int cardid = 0;
        for (int i = 1; i <= players; i++){
            System.out.println("Карты для игрока"+ i);
            for (int j = 0; j < 5; j++){
                System.out.print(" " + deck.get(cardid));
                cardid++;
            }
            System.out.println(" ");
        }
    }
    private static List<String> createdeck(){
        List<String> deck = new ArrayList<>();
        for (String i: Suits){
            for (String j: Numbers){
                deck.add(j+i);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }
}
