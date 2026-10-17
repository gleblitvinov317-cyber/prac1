package balltask;

import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стартовые координаты");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println("Введите изменённые координаты");
        x = sc.nextDouble();
        y = sc.nextDouble();
        ball.setXY(x, y);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println("Введите координаты движения");
        x = sc.nextDouble();
        y = sc.nextDouble();
        ball.move(x, y);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }
}
