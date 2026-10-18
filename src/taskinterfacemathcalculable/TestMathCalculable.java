package taskinterfacemathcalculable;

public class TestMathCalculable {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.absComplex(12, -2));
        System.out.println(mc.powComplex(12, 54, 3.4));
        System.out.println(mc.lenghtCircle(4));
    }
}
