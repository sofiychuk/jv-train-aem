package oopPhone;

import java.util.Arrays;

public class Phone {
    long number;
    String model;
    double weight;

    Phone() {

    }

    Phone(long n, String m) {
        number = n;
        model = m;
    }

    Phone(long n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    void receiveCall(String name, long number) {
        System.out.println("Звонит: " + name + " Номер: " + number);
    }
    long getNumber() {
        return number;
    }

    void sendMessage(long... numbers){
        System.out.println(Arrays.toString(numbers));
    }
}
