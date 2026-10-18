package shapetask;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle (double a, double b, String color, boolean filled){
        super("прямоугольник", color, filled);
        this.width = a;
        this.length = b;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double a, String color, boolean filled){
        super("квадрат", color, filled);
        this.width = a;
        this.length = a;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    @Override
    public String toString(){
        return super.toString() + " со сторонами " + length + " " + width + " цвета " + getColor() + " заполленности " + isFilled();
    }
}
