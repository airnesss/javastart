package pl.sda.javastart.PROGRAMOWANIE1.day3;


import pl.sda.javastart.day1.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
      //  "agshgsakasnsalelasblsahgl".chars()
       //      .mapToObj(c -> String.valueOf((char) c)



      //  List<String> friends = Arrays.asList("Ross", "Chandler", "CSS",
           //    "Monica", "Joey", "Rachel");

  //     friends.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name  + " "));
String str = IntStream.range(0,20).mapToObj(c->maptoString(c))
        .collect(Collectors.joining(",","(",")"));
        System.out.println(str);


    }

    public static String maptoString ( int i){
        return String.format("%d",i);
    }
}
