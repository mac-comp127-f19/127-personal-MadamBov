package comp127.basicJava;

import java.awt.*;
import java.util.Scanner;

public class SqaureNums {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double input;
        System.out.println("Please enter a number");
        input=scanner.nextInt();
        while((input*input)%4!=0){
            System.out.println("Please Enter a number");
            input=scanner.nextDouble();
        }
    }
}

