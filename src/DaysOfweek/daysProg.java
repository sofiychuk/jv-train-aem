package DaysOfweek;

public class daysProg {
    public static void main(String[] args) {
        int dayOfWeek = Integer.parseInt(args[0]);
        if (dayOfWeek == 1) {
            System.out.println("Понеділок");
        } else if (dayOfWeek == 2) {
            System.out.println("Вівторок");
        } else if (dayOfWeek == 3) {
            System.out.println("Середа");
        } else if (dayOfWeek == 4) {
            System.out.println("Четверг");
        } else if (dayOfWeek == 5) {
            System.out.println("Пятниця");
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("Вихідні");
        } else {
            System.out.println("Такого дня неділі не існує");
        }
    }

}