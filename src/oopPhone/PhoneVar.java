package oopPhone;

public class PhoneVar {
    public static void main(String[] args) {
        Phone xiaomi = new Phone(380932626819L, "Xiaomi", 193.42);
        Phone iphone = new Phone(380977656819L, "Iphone");
        Phone samsung = new Phone();

//        xiaomi.number = 380932626819L;
//        xiaomi.weight = 193.42;
//        xiaomi.model = "Xiaomi";

//        iphone.number = 380977656819L;
//        iphone.weight = 226.31;
//        iphone.model = "Iphone";
//
//        samsung.number = 380987655112L;
//        samsung.weight = 184.79;
//        samsung.model = "Samsung";

        System.out.println(xiaomi.weight);
        System.out.println(xiaomi.model);
        System.out.println(iphone.weight);
        System.out.println(iphone.model);
        System.out.println(samsung.weight);
        System.out.println(samsung.model);


        xiaomi.receiveCall("John", 380969056449L);
        xiaomi.receiveCall("Bro");
        iphone.receiveCall("David");
        samsung.receiveCall("Mom");

        System.out.println(xiaomi.getNumber());
        System.out.println(iphone.getNumber());
        System.out.println(samsung.getNumber());

        xiaomi.sendMessage(380969222249L, 380969223333L, 380969221213L);
        iphone.sendMessage(380969222249L);
    }
}
