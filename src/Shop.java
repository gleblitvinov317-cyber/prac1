import java.util.List;
import java.util.ArrayList;
public class Shop {
    private final List<Computer> computers = new ArrayList<>();
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void removeComputer(int index){
        if (index < 0 || index >= computers.size()){
            computers.remove(index);
        }
    }
    public List<Computer> findComputer(String name, String cpu, int ram, int storage, int price){
        List<Computer> result = new ArrayList<>();
        for(Computer c: computers){
            if (c.getName().equalsIgnoreCase(name) && c.getName().equalsIgnoreCase(cpu) && c.getRam() == ram && c.getStorage() == storage && c.getPrice() == price){
                result.add(c);
            }
        }
        return result;
    }
}
