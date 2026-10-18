package shapetask;

public class Circle extends Shape{
    private double radius;
    public Circle (double r, String color, boolean isFilled){
        super("окружность", color, isFilled);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI * radius;
    }
    @Override
    public String toString(){
        return super.toString() + " радиус = " + radius + " цвета " + getColor() + " Заполненность " + isFilled();
    }
}
