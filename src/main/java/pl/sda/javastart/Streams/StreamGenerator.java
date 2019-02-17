package pl.sda.javastart.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, x -> x + 1);

        //// lista 100 pierwszych liczb podzielnych przez 2

//        List<Integer> numbers = stream.filter(x -> x % 2 == 0).limit(100).collect(Collectors.toList());
     //   numbers.forEach(x -> System.out.println(x + " ; "));
   //     System.out.println("Next Stream");


        //// lista kwadratów kolejnych 100 liczb całkowitych

   //     List<Integer> squareNumbers = stream.map(x -> x * x).limit(100).collect(Collectors.toList());
        //    squareNumbers.forEach(x -> System.out.println(x + " ; "));
    //    System.out.println("Next Stream");



        //// lista 100 liczb ujemnych w kolejności malejącej

         List<Integer> negativeNum = stream.map(x -> -x).limit(100).collect(Collectors.toList());
         negativeNum.forEach(x -> System.out.println(x + " ;"));


    }
}
