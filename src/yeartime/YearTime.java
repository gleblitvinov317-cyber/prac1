package yeartime;

public enum YearTime {
    SUMMER(25){
        @Override
        public String getDescription(){
            return "Тёплое время года";
        }
    },
    AUTUMN(10),
    WINTER(-20),
    SPRING(12);
    private final int temp;
    private YearTime (int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription(){
        return "Холодное время года";
    }
    public static String loveYeartime (YearTime time){
        switch (time){
            case AUTUMN-> {
                return "I love Autumn";
            }
            case SPRING -> {
                return "I love spring";
            }
            case SUMMER -> {
                return "I love summer";
            }
            case WINTER -> {
                return "I love winter";
            }
        }
        return "";
    }
}
