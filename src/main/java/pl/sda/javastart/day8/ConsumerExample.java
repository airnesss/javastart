package pl.sda.javastart.day8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ConsumerExample {
    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public static void main(String[] args) {
        System.out.println(salariesMap());
    }

    //metoda zmieniajaca tablice w liste
    public List<Customer> customerList() {                       //metoda ma uzyć pola wyzej
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer);


        }
        return customers;

    }

    // tu ze stream!!!
    public List<Customer> customerListWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.toList());              //colectors zbieranie w liste
    }

    public List<String> customerNameList() {
        //Napisz metodę, która przyjmie tablicę people i zwróci listę Stringów <imię nazwisko>
        // (elementem listy będzie np "Anna Nowak")
        List<String> resoultList = new ArrayList<>();
        for (Customer customer : people) {
            resoultList.add(customer.getFirstname() + " " + customer.getSurname());
        }
        return resoultList;

    }
    public List<String> customerNamesWithStream(){
        return customerList().stream()
                .map(e -> e.getFirstname() + " " + e.getSurname())
                   .collect(Collectors.toList());                                          //w mapie zmieniamy dane w tym wypadku na napis !!
    }
    //Napisz metodę, która zwróci mapę osób według zarobków
    // <zarobki,osoby_z_zarobkami>

    public static Map<BigDecimal, List<String>> salariesMap(){
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        for (Customer customer : people){
            if (resultMap.containsKey(customer.getSalary())){
               List<String> innerList = resultMap.get(customer.getSalary());
               innerList.add(customer.getId() + ", " + customer.getFirstname() + ", " + customer.getSurname());
            }else {
                List<String> innerList = new ArrayList<>();            //zasieg wyznaczaa nawiasu INER LIST
                innerList.add(customer.getId() + ", " + customer.getFirstname() + ", " + customer.getSurname());
                resultMap.put(customer.getSalary(), innerList);
            }

        }
        return resultMap;

    }


}

