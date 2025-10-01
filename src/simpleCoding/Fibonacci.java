package simpleCoding;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1] })
                .limit(10)
                .map(f->f[0])
                .forEach(i->System.out.print(i+" "));
    }
}
//Stream.iterate(initial, nextFunction)
//Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1] })-Creates an infinite stream starting with the array [0, 1]
//f -> new int[] {f[1], f[0] + f[1]} defines how to get the next element from the current one.
//Here f is an int[] of size 2, where:
//f[0] → previous simpleCoding.Fibonacci number
//f[1] → current simpleCoding.Fibonacci number
