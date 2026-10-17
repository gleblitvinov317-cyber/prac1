package TaskAtelier;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(int price, Sizes size, String color){
        super(price, size, color);
    }
    @Override
    public String describe(){
        return " штаны размера " + getSizeColther() + "(" + getSizeColther().getDescription() + ") ценны " + getPrice() + "цвета " + getColor();
    }
    @Override
    public String dressMan(){
        return "Мужские" + describe();
    }
    @Override
    public String dressWomen(){
        return "Женские" + describe();
    }
}
