package pl.sda.javastart.JavaStart;

public class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        //sprawdzenie równości fizycznej za pomocą ==
        if (this == o)
            return true;
        //sprawdzamy czy nie NULL
        if (o == null)
            return false;
        //sprawdzam czy przekazany argument jest typu Student
        if (!(o instanceof Student))
            return false;
        //rzutowanie na odpowiedni typ
        Student s = (Student) o;

        //sprawdzanie kolejny pól klasy , uważając na wartość null
        if (this.firstName == s.firstName && this.lastName == s.lastName)
        return true;
        if (this.firstName != null) {
            if (this.firstName.equals(s.firstName))
                return false;
        } else if (this.firstName == null && s.firstName != null)
            return false;
        if (this.lastName != null) {
            if (this.lastName.equals(s.lastName))
                return false;
        } else if (this.lastName == null && s.lastName != null)
            return false;
        //jeśli dodziemy do tego miejsca obiekty są równe
    return true;
    }

}
