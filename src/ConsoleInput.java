import java.util.Scanner;
public class ConsoleInput implements Inputable {
    Scanner sc;
    public ConsoleInput (Scanner scanner){
        this.sc = scanner;
    }
    @Override
    public int inputInt(String txt){
        System.out.print(txt);
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }
    @Override
    public double inputDouble(String txt){
        System.out.print(txt);
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
    }
    @Override
    public String inputString(String txt){
        System.out.print(txt);
        return sc.nextLine();
    }
    @Override
    public String[] inputStringArray(String txt){
        System.out.print(txt);
        return sc.nextLine().split(" ");
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
    @Override
    public FindComputer findComputer(){
        String[] name = inputStringArray("Введите марки компьютера которые хотите найти: ");
        String[] cpu = inputStringArray("Введите процессоры которые хотите найти: ");
        int minRam = inputInt("Введите минимальный объём опреативной памяти: ");
        int maxRam = inputInt("Введите максимальный объём оперативной памяти: ");
        int minStorage = inputInt("Введите минимальный объём памяти: ");
        int maxStorage = inputInt("Введите максимальный объём памяти: ");
        double minPrice = inputDouble("Введите минимальную стоимость компьютера: ");
        double maxPrice = inputDouble("Введите максимальную стоимость компьютера: ");
        return new FindComputer(name, cpu,minRam, maxRam, minStorage, maxStorage, minPrice, maxPrice);
    }
}
