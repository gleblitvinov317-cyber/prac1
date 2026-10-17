package TaskAtelier;

public class Atelier {
    private final Clothes[] clothes;
    public Atelier(Clothes[] clothes){
        this.clothes = clothes;
    }
    public String dressMan(){
        String out = "";
        for (Clothes item: clothes){
            if(item instanceof MenClothing){
                out += ((MenClothing) item).dressMan();
                out += "\n";
            }
        }
        return out;
    }
    public String dressWomen(){
        String out = "";
        for (Clothes item: clothes){
            if (item instanceof WomenClothing){
                out += ((WomenClothing) item).dressWomen();
                out += "\n";
            }
        }
        return out;
    }
}
