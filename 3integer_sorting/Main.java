import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the integer:");
        double val1 = keyboard.nextDouble();

        System.out.println("Enter the integer:");
        double val2 = keyboard.nextDouble();

        System.out.println("Enter the integer:");
        double val3 = keyboard.nextDouble();


        if ((val1 > val2) && (val1 > val3)) {
            if (val2 > val3) {
                System.out.println(val1 + " > " + val2 + " > " + val3);
            }else if (val3 > val2){
                    System.out.println(val1 + " > " + val3 + " > " + val2);
                }


        }else if ((val2 > val1) && (val2 > val3)) {
            if (val1 > val3) {
                System.out.println(val2 + " > " + val1 + " > " + val3);
            } else if (val3 > val1){
                System.out.println(val2 + " > " + val3 + " > " + val1);
            }

        }else if ((val3 > val1) && (val3 > val2)){
            if (val1 > val2){
                System.out.println(val3 + " > " + val1 + " > " + val2);
            }else if (val2 > val1) {
                System.out.println(val3 + " > " + val2 + " > " + val1);
            }
        }
    }
}