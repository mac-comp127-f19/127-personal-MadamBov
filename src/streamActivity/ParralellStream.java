package streamActivity;

import java.util.stream.Stream;

public class ParralellStream {
    private static final long N =3L;
    public static void sequentialSum(long n) {
        Stream.iterate(1L, i -> i + 1).limit(n).forEach(d->System.out.print(" "+d));
        }
    public static void  parallelSum(long n) {
        Stream.iterate(1L, i -> i + 1).limit(n).parallel().forEachOrdered(d->System.out.print(" "+d));
    }
    public static void main(String[] args) {
        long start=System.nanoTime();
        sequentialSum(100L);
        long end=System.nanoTime();
        long timeElapsed=end-start;
        System.out.println(timeElapsed);
        long start2=System.nanoTime();
        parallelSum(100L);
        long end2=System.nanoTime();
        long timeElapsed2=end2-start2;
        System.out.println(timeElapsed2);

    }

}
