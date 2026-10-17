public class FindComputer {
    private String[] name;
    private String[] cpu;
    private int minRam;
    private int maxRam;
    private int minStorage;
    private int maxStorage;
    private double minPrice;
    private double maxPrice;

    public FindComputer(String[] name, String[] cpu, int minRam, int maxRam, int minStorage, int maxStorage, double minPrice, double maxPrice) {
        this.name = name;
        this.cpu = cpu;
        this.minRam = minRam;
        this.maxRam = maxRam;
        this.minStorage = minStorage;
        this.maxStorage = maxStorage;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String[] getName(){return name;}
    public String[] getCpu(){return cpu;}
    public int getMinRam() {
        return minRam;
    }
    public int getMaxRam(){return maxRam;}
    public int getMinStorage(){return minStorage;}
    public int getMaxStorage(){return maxStorage;}
    public double getMinPrice(){return minPrice;}
    public double getMaxPrice(){return maxPrice;}
}
