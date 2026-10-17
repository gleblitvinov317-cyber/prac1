package TaskAtelier;

public class Skirt extends  Clothes implements WomenClothing{
    public Skirt(int price, Sizes size, String color){
        super(price, size, color);
    }
    @Override
    public String describe(){
        return "Юбка размера " + getSizeColther() + "(" + getSizeColther().getDescription() + ") цвета " + getColor() + " стоимости " + getPrice();
    }
    @Override
    public String dressWomen(){
        return describe();
    }
}
