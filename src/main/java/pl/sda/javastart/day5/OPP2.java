package pl.sda.javastart.day5;

public class OPP2 {
    public static void main(String[] args) {
        eualsExample();
        referenceExample();
        staticFinal();
        TestPerson person1 = new TestPerson("Kowalski","Janusz");
        System.out.println(person1.getIdentity());


    }

    private static void staticFinal() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();
        System.out.println(person1.getIdentity());            //jest 3 i 4 w sout bo counter juz podbił z eualsExample
        System.out.println(person2.getIdentity());
        System.out.println("Ludzi na świecie jest: " + (TestPerson.counter - 1));


        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(3, 7));
        //CalculatorUtils
        System.out.println(CalculatorUtils.adding(4, 6));     // STATYCZNA wystarczy z jakiej klasy chcemy ja wywolac
        person1.setFirstName("Marcin");
        ExperimentalObects eo = new ExperimentalObects(1, 2, person1);
        eo.setNotFinalImutable(6);               //zmiana referencji tworzymy nowy obiet 6
        TestPerson personFromEo = eo.getFinalMutable();   // dostajemy sie poziom nizej od set ( tego wyzej )
        personFromEo.setFirstName("Kamil");                 // dostalismy sie poziom nizej od tego co jest wyzeej
    }

    private static void referenceExample() {
        String sl = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(sl == s2);
        System.out.println(sl == s3);
        System.out.println(sl.equals(s2));
        System.out.println(sl.equals(s3));
        Long firtNumber = 127L;                       //reużywaja sie do 127 jako obiekt
        Long sesondNumber = 127L;
        System.out.println(firtNumber == sesondNumber);
        System.out.println(firtNumber.equals(sesondNumber));
        Long thirdNumber = 128L;                                   //UP
        Long fourtNumber = 128L;
        System.out.println(fourtNumber == thirdNumber);
        System.out.println(fourtNumber.equals(thirdNumber));
    }

    private static void eualsExample() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();

        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setIdentity(123);
        person2.setIdentity(123);
        person1.setSurname("Nowak");
        person2.setSurname("Nowak");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());

        TestPerson person3 = new TestPerson("Anna", "Nowak", 123);


    }
}

