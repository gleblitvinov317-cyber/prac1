package TaskAtelier;

public class Tie extends Clothes implements MenClothing{
    public Tie(int price, Sizes size, String color){
        super(price, size, color);
    }
    @Override
    public String describe(){
        return "Галстук размером " + getSizeColther() + "(" + getSizeColther().getDescription() + ") цвета " + getColor() + " стоимости " + getPrice();
    }
    @Override
    public String dressMan(){
        return describe();
    }
}
