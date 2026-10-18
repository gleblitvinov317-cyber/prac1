package shapetask;

public class Square extends Rectangle{
    public Square (String color, boolean filled){
        super(1, color, filled);
    }
    public Square (double a, String color, boolean filled){
        super(a, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
