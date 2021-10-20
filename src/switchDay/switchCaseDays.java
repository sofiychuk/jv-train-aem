package switchDay;

public class switchCaseDays {
    public static void main(String[] args) {
        int dayOfWeek = Integer.parseInt(args[0]);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("ЧТ");
                break;
            case 5:
                System.out.println("ПТ");
                break;
            case 6:
                System.out.println("ВИхідні");
                break;
            case 7:
                System.out.println("ВИхідні");
                break;
            default:
                System.out.println("Такого дня неділі не існує");
        }
    }
}
