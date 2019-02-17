package pl.sda.javastart.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsStrem {
    public static void main(String[] args) {
        //     Stream<String>strings= Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
        //    strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        //  }

        Stream<String> stringStream = Stream.of("b", "cc", "ddd", "eeee", "fffff", "ggggg");
        List<String> stringList = stringStream.peek(System.out::println)
                .map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
    }
}