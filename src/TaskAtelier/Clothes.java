package TaskAtelier;

public abstract class Clothes {
    private Sizes sizeColther;
    private int price;
    private String color;

    public Clothes(int price, Sizes sizeColther, String color) {
        this.price = price;
        this.sizeColther = sizeColther;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Sizes getSizeColther() {
        return sizeColther;
    }
    public abstract String describe();
}
