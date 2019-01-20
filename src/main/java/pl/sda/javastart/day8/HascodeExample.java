package pl.sda.javastart.day8;

import java.util.HashSet;
import java.util.Set;

public class HascodeExample {
    public static void main(String[] args) {
        System.out.println("constant");                                   //FIXME dodaj fora powniej !
        ConstatntHashCode cons1 = new ConstatntHashCode("6");
        ConstatntHashCode cons2 = new ConstatntHashCode("6");
        ConstatntHashCode cons3 = new ConstatntHashCode("6");
        ConstatntHashCode cons4 = new ConstatntHashCode("6");
        ConstatntHashCode cons5 = new ConstatntHashCode("6");
        System.out.println("random");
        RandomHashCode random1 = new RandomHashCode("7");
        RandomHashCode random2 = new RandomHashCode("7");
        RandomHashCode random3 = new RandomHashCode("7");                // 5 elementów ale pod innymi BUCKETAMI !!!
        RandomHashCode random4 = new RandomHashCode("7");
        RandomHashCode random5 = new RandomHashCode("7");

        Set<ConstatntHashCode> constatntHashCodes = new HashSet<>();
        constatntHashCodes.add(cons1);
        constatntHashCodes.add(cons2);
        constatntHashCodes.add(cons3);
        constatntHashCodes.add(cons4);
        constatntHashCodes.add(cons5);
        System.out.println(constatntHashCodes.size());

        Set<RandomHashCode> randomHashCodes = new HashSet<>();
        randomHashCodes.add(random1);
        randomHashCodes.add(random2);
        randomHashCodes.add(random3);
        randomHashCodes.add(random4);
        randomHashCodes.add(random5);
        System.out.println(randomHashCodes.size());
        System.out.println(randomHashCodes.contains(random1));
    }
}
