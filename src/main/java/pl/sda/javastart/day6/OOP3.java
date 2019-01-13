package pl.sda.javastart.day6;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
        //Person person1 = new Person();
        // Worker worker1 = new Worker();
        Worker worker = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1300));
        Studnet studnet = new Studnet("Kasia", "Kowalska", 321, 20, 40, BigDecimal.valueOf(900));
        Pensioner pensioner = new Pensioner("Janusz", "Kwiatkowski", 920, 34, BigDecimal.valueOf(3000));

        Person[] people = new Person[]{worker, studnet, pensioner};         //tablica w której umieszczamy wokera, studenta i pennsionera
        Object[] objects = new Object[]{worker, studnet, pensioner};

        List<Person> peopleList = new ArrayList<>();             //LISTA Z 3 Obiektami
        peopleList.add(worker);
        peopleList.add(studnet);
        peopleList.add(pensioner);

        printDataLegacyMode(worker, studnet, pensioner);              //metoda pringData
        printDataProperWay(peopleList);

        List<NameHolder> nameHolders = new ArrayList<>();
        nameHolders.add(worker);
        nameHolders.add(studnet);
        //nameHolders.add(pensioner) nie implementuje bo nie zrobiliśmy tego w nameHolder
        printNames(nameHolders);


    }

    private static void printNames(List<NameHolder> nameHolders) {
        for (NameHolder nameHolder : nameHolders) {
            System.out.println(nameHolder.showYourName());
        }
    }

    private static void printDataLegacyMode(Worker worker, Studnet studnet, Pensioner pensioner) {
        System.out.println(worker.showMeIncome());
        System.out.println(pensioner.showMeIncome());
        System.out.println(studnet.getScholarship());
        worker.introductionInner();
        studnet.introductionInner();
        pensioner.inoductionInner();


    }

    private static void printDataProperWay(List<Person> peopleInfo) {                           //Przekazanie i nazwanie listy
        for (Person person : peopleInfo) {
            System.out.println(person.showMeIncome());
            if (person instanceof Worker) {
                ((Worker) person).introductionInner();                                      //rzutowanie tutaj kompilator wie ze person jest workerem
            } else if (person instanceof Studnet) {
                ((Studnet) person).introductionInner();
            } else {
                ((Pensioner) person).inoductionInner();
            }


        }

    }

}
