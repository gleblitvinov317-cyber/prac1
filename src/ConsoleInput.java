import java.util.Scanner;
public class ConsoleInput implements Inputable {
    Scanner sc = new Scanner(System.in);
    @Override
    public int inputInt(String txt){
        System.out.print(txt);
        return sc.nextInt();
    }
    @Override
    public double inputDouble(String txt){
        System.out.print(txt);
        return sc.nextDouble();
    }
    @Override
    public String inputString(String txt){
        System.out.print(txt);
        return sc.nextLine();
    }
    @Override
    public  Computer getComputer(){
        String name = inputString("Введите название компьютера: ");
        String cpu = inputString("Введите процессор компьютера: ");
        int ram = inputInt("Введите объём оперативной памяти: ");
        int storage = inputInt("Введите объём памяти компьютера: ");
        double price = inputDouble("Введите цену компьютера: ");
        return new Computer(name, cpu, ram, storage, price);
    }
}
