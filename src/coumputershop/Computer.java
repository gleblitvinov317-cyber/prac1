package coumputershop;

public class Computer {
    private String name;
    private String cpu;
    private int ram;
    private int storage;
    private double price;
    public Computer(String name, String cpu, int ram, int storage, double price){
        this.cpu = cpu;
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    public String getName(){return name;}
    public String getCpu(){return cpu;}
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "coumputershop.Computer{" + "name = " + name + ", cpu = " + cpu + ", ram = " + ram + ", storage = " + storage + ", price = " + price + "}";
    }
}
