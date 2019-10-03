package comp127.basicJava;

public class SeriesSum2 {
    public static void main(String[] args){
        double sum=0;
        double i=1;
        while(sum<2) {
            sum=1/i+sum;
            i++;
        }
        System.out.println(i-2);
    }
}

