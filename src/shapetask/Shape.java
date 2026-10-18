package shapetask;

public abstract class Shape {
    private final String name;
    protected String color;
    protected boolean filled;
    public Shape (String name, String color, boolean isFilled) {
        this.name = name;
        this.color = color;
        this.filled = isFilled;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
