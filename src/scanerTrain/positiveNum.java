package scanerTrain;

import java.util.Scanner;

public class positiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt());
        int userNum = sc.nextInt();

        if(userNum > 0 && userNum <= 10){
            System.out.println("Положительное число меньше 10");
        } else if(userNum < 0 || userNum > 10){
            System.out.println("Положительное число больше 10 или отрицательное");
        }else if(sc.hasNextDouble() || sc.hasNextFloat()){
            System.out.println("Не целое число");
        }
        sc.close();
    }
}
