package enumTrain;

public class SeasonMain {
    public static void main(String[] args) {
        Seasons season = Seasons.WINTER;
        System.out.println(season);
        favouriteSeason(Seasons.WINTER);
        allValues();
    }

    public static void favouriteSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю Зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето");
                break;
            case SPRING:
                System.out.println("Я люблю Весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю Осень");
                break;
        }
    }
    public static void allValues(){
        for (Seasons seas : Seasons.values()){
            System.out.println(seas + " " + seas.getAverageTemp() + " " + seas.getDescription());
        }
    }
}
