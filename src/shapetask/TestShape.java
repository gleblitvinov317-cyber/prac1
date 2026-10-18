package shapetask;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes =  {
                new Circle (3, "yellow", true),
                new Rectangle(2, 6.7, "black", false),
                new Square(3.14, "pink", false)};
        for(Shape s: shapes){
            System.out.printf("Название %s | Площадь %.2f | Периметр %.2f%n%s%n", s.getName(), s.getArea(), s.getPerimeter(), s);
        }
    }
}
