package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder{                    //EXTENDS

    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        //super(); jestli nie napiszemy super (....) z parametrami to w tym miejscu znajdzie sie super bez paramterów
        super(firstName, lastName, identity, age);             //zroblismy to konstruktorem alt + instert ( CONSTRUKTOR)
        this.salary = salary;

    }

public void introductionInner(){
        super.introduction();
    System.out.println("Ale też pracownikiem ");
}
 @Override
 public String showYourName(){
       return getFirstName() + " " + super.getLastName();    //nie trzeba pisac super bo mam tylko 1 metode getFirstName
 }


    @Override
    public BigDecimal showMeIncome(){
        return salary;

    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
