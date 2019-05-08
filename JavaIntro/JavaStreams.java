package _arrays_1_compare_matrices;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
  //-> Lambda Expression
        long start = System.nanoTime();
//some try with nested loops


        int [] arr = new int[Integer.MAX_VALUE-1000000000];


        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println(seconds);
        TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);

        start = System.nanoTime();
        IntStream lines = Arrays.stream(arr);

        IntStream result =  Arrays.stream(arr);
       // System.out.println(lines.count());
        /*IntConsumer icons = i -> System.out.print("" + "");

        Arrays.stream(arr).forEach(icons);*/
        end = System.nanoTime();
        elapsedTime = end - start;
        seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println(seconds);

        //icons = i -> System.out.println(i + "");

            //copy array
        start = System.nanoTime();
        int [] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        end = System.nanoTime();
        elapsedTime = end - start;
        seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println(seconds);

    }
}
