package pl.sda.javastart.JavaStart;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = student1;
        System.out.println("Student 1 == Student2");
        System.out.println(student1==student2);
        System.out.println("Student1.equals(student2");
        System.out.println(student1.equals(student2));
    }
}
