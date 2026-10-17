package coumputershop;

public interface Inputable {
    Computer getComputer();
    FindComputer findComputer();
    int inputInt(String txt);
    double inputDouble(String txt);
    String inputString(String txt);
    String[] inputStringArray(String txt);
}
