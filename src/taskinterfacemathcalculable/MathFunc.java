package taskinterfacemathcalculable;

public class MathFunc implements MathCalculable{
    @Override
    public String powComplex(double re, double im, double degree){
        double phi = Math.atan2(im, re);
        return Math.pow(absComplex(re, im), degree)*Math.cos(degree*phi) + " + " +Math.pow(absComplex(re, im), degree)*Math.sin(degree*phi) + "i";
    }
    @Override
    public double absComplex(double re, double im){
        return  Math.sqrt(re*re+im*im);
    }
    @Override
    public double lenghtCircle(double r){
        return PI*r*2;
    }
}
