package comp127.basicJava;

import java.awt.*;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Please enter the layer of the pyramid");
        input=scanner.nextInt();
        for(int i=1;i<=input;i++){
            String string="";
            for (int o=1;o<=input-i;o++){
                string=string.concat(" ");
                }
            for (int p=1;p<=(2*i)-1;p++){
                string=string.concat("*");
            }
            System.out.println(string);
        }
    }
}
