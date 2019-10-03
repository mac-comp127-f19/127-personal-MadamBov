package comp127.basicJava;

public class SeriesSum {
    public static void main(String[] args){
        double sum=0;
        for(double i=1;i<=10;i++) {
            sum=sum+(1/i);
        }
        System.out.println(sum);
    }
}
