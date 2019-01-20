package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Studnet;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ColetionsExample {
    public static final Studnet studnet1 = new Studnet("Jan", "Kowalski", 4, 20, 30, BigDecimal.valueOf(2000));
    public static final Studnet studnet2 = new Studnet("Piotr", "Kowalski", 120, 29, 450, BigDecimal.valueOf(1400));
    public static final Worker worker = new Worker("Maciej", "Adamiak", 50, 20, BigDecimal.valueOf(2000));
    public static final Pensioner pensioner = new Pensioner("Bartek", "Staciak", 99, 30, BigDecimal.valueOf(4000));
    public static final Pensioner pensioner2 = new Pensioner("Michał", "Stasiak", 59, 34, BigDecimal.valueOf(5000));

    public static void main(String[] args) {

        treeSetExample();   //METODA
        listExample();
        hashSetExample();
        hasgMapExample();
        namesStaticMap();


       System.out.println("przykład z liczeniem nazwiska");
        List<Person>personList= populatePeopleList();
       Map<String, Long>resultMap = personList.stream()
                .map(e->e.getLastName())
               .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(resultMap);

    }

    private static void namesStaticMap() {
        List<Person> personList = populatePeopleList();
        Map<String, Integer> resultMap = new HashMap<>();
        for (Person x : personList) {
            String ourKey;
            if (x.getLastName()==null) {

             ourKey=    x.getLastName().trim();
            }else {
                ourKey=null;
            }
            if (resultMap.containsKey(ourKey)) {
                int counter = resultMap.get(ourKey);
                resultMap.replace(ourKey, counter + 1);

            } else {
                resultMap.put(ourKey, 1);
            }
        }
        System.out.println(resultMap);
    }

    private static void hasgMapExample() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(studnet1.getIdentity(), studnet1);
        personMap.put(worker.getIdentity(), worker);
        personMap.put(pensioner.getIdentity(), pensioner);
        personMap.put(studnet2.getIdentity(), studnet2);
        personMap.put(pensioner2.getIdentity(), pensioner2);
        System.out.println(personMap);
    }

    private static void hashSetExample() {
        //Set<Person> setOfPerson = new LinkedHashSet<>();  w tym przypadku zostanie zachowana kolejnosc!!
        Set<Person> setOfPerson = new HashSet<>();

        System.out.println(setOfPerson.add(studnet1));
        System.out.println(setOfPerson.add(pensioner));
        System.out.println(setOfPerson.add(worker));
        System.out.println(setOfPerson.add(pensioner));
        System.out.println(setOfPerson.add(pensioner2));
        System.out.println(setOfPerson);
    }

    private static void listExample() {
        List<Person> personList = populatePeopleList();


        System.out.println(personList.contains(pensioner));
        personList.remove(pensioner);
        System.out.println(personList.contains(pensioner));

        System.out.println(personList);
    }

    private static List<Person> populatePeopleList() {
        List<Person> personList = new ArrayList<>();
        personList.add(studnet1);
        personList.add(studnet2);
        personList.add(worker);
        personList.add(pensioner);
        personList.add(pensioner2);
        return personList;
    }

    private static void treeSetExample() {
        Set<Person> tSet = new TreeSet<>();

        tSet.add(studnet2);
        tSet.add(studnet1);
        System.out.println(tSet.toString());

        for (Person x : tSet) {
            System.out.println(x.getFirstName());
        }
        tSet.stream()
                .map(e -> e.getFirstName()).forEach(e -> System.out.println(e));    //STREAM

    }
}
