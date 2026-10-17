package TaskAtelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(int price, Sizes sizeColther, String color) {
        super(price, sizeColther, color);
    }
    @Override
    public String describe(){
        return "футболка цвета " + getColor() + " размера " + getSizeColther() + "(" + getSizeColther().getDescription() + ")" + " стоимости " + getPrice();
    }
    @Override
    public String dressMan(){
        return "Мужская " + describe();
    }
    @Override
    public String dressWomen(){
        return "Женская " + describe();
    }
}
