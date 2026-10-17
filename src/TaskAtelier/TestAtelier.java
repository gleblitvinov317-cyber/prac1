package TaskAtelier;

public class TestAtelier {
    public static void main(String[] args) {
        Atelier at = new Atelier(new Clothes[]{
                new TShirt(10, Sizes.M, "Yello"),
                new Tie(15, Sizes.XXS, "Black"),
                new Skirt(5, Sizes.S, "Pink")});
        System.out.println(at.dressMan());
        System.out.println(at.dressWomen());
    }
}
