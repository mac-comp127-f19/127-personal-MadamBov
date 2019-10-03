package comp127.basicJava;

import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        input = scanner.nextInt();
//        while(input>=0){oddEven(input);
//        System.out.println("Enter an integer");
//        input=scanner.nextInt()
//       }
        snetinel(input);
    }
    public static void oddEven(Integer input) {
            if (input % 2 == 0) {
                System.out.println("This is an even number!");
            } else System.out.println("This is an odd number!");
    }

    public static void snetinel(Integer input) {
        Integer count=0;
        double ninput=(double)input;
        while (ninput >1) {
            ninput = ninput / 2.0;
            count++;
            System.out.println(ninput);
        }
        System.out.println(count);
//        return count;
    }
}