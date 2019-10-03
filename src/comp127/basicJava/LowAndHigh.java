package comp127.basicJava;

import java.util.Scanner;

public class LowAndHigh {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double input=0;
        double highestNum=0,lowestNum=0,marginal=0;
        int sum=0;

        while(input>=0){
            marginal=input;
            System.out.println("Please Enter a Number");
            input=scanner.nextDouble();
            if(input>=0){
                sum++;
            }
            if(sum<=1&&input>0){lowestNum =input;}
            if(sum<1&&input<0){
                highestNum=lowestNum=0;
            }
            else if(sum==1&&input<0){highestNum=lowestNum=marginal;}
            else if(sum>=1&&input>=0){if(input>highestNum){ highestNum=input;}
            else if(input<marginal) { lowestNum=input;}
            }
        }
        System.out.println("Highest number is "+highestNum);
        System.out.println("Lowest number is "+lowestNum);
    }
}
