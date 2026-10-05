import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop sp = new Shop();
        ConsoleInput cp = new ConsoleInput(sc);
        System.out.println("Введите количество компьютером");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            sp.addComputer(cp.getComputer());
        }
        System.out.println("Введите данные компьютера которые хотите найти");
        System.out.println(sp.findComputer(cp.findComputer()));
        System.out.println("Удалим компьютер по индексу");
        sp.removeComputer(0);
        System.out.println(sp.findComputer(cp.findComputer()));
    }
}
