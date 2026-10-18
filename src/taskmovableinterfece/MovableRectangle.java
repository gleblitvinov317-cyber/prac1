package taskmovableinterfece;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (!topLeft.isEquals(bottomRight)){
            throw new IllegalArgumentException("Скорости у точек разные");
        }else if (x1==x2 || y1 == y2){
            throw new IllegalArgumentException("Данными точками нельзя задать прямоугольник");
        }
    }
    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public String toString(){
        return "Прямоугольник заданный двумя точками " + topLeft + " " + bottomRight;
    }
}
