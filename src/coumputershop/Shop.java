package coumputershop;

import java.util.List;
import java.util.ArrayList;
public class Shop {
    private final List<Computer> computers = new ArrayList<>();
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void removeComputer(int index){
        if (0 <= index && index < computers.size()){
            computers.remove(index);
        }
    }
    public List<Computer> findComputer(FindComputer computer){
        List<Computer> result = new ArrayList<>();
        for(Computer c: computers){
            boolean nameInSearch = false;
            boolean cpuInSearch = false;
            for(String i: computer.getName()){
                if (c.getName().equalsIgnoreCase(i)){
                    nameInSearch = true;
                }
            }
            for(String i: computer.getCpu()){
                if(c.getName().equalsIgnoreCase(i)){
                    cpuInSearch = true;
                }
            }
            if (nameInSearch && cpuInSearch && c.getRam() >= computer.getMinRam() && c.getRam() <= computer.getMaxRam() && c.getStorage() >= computer.getMinStorage() && c.getStorage() <= computer.getMaxStorage() && c.getPrice() >= computer.getMinPrice() && c.getPrice() <= computer.getMaxPrice()){
                result.add(c);
            }
        }
        return result;
    }
}
