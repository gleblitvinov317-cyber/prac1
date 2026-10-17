package yeartime;

public class TestEnum {
    public static void main(String[] args) {
        YearTime time = YearTime.SPRING;
        System.out.println(time.getTemp());
        System.out.println(YearTime.loveYeartime(time));
        for(YearTime ytime: YearTime.values()){
            System.out.println(ytime + " " + ytime.getTemp() + " " + ytime.getDescription());
        }
    }
}
