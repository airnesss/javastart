package pl.sda.javastart.Exceptions;

import com.sun.org.apache.bcel.internal.classfile.Unknown;

public class Calculator {
    //  Napisz kalkulator operujący na liczbach zmiennoprzecinkowych, który będzie pobierał dane od użytkownika i będzie
//  pozwalał obliczyć wyniki dodawania, odejmowania, mnożenia i dzielenia. Program powinien być odporny na błędnie
//  wprowadzane dane i prosić użytkownika o korektę. Zwróć także uwagę na fakt, że w przypadku dzielenia przez 0
//  zostanie wygenerowany wyjątek ArithmeticException, który również należy obsłużyć i wyświetlić odpowiedni komunikat
//  użytkownikowi.
//
//  {Zdefiniuj również klasę wyjątku UnknownOperatorException, który będzie generowany w przypadku,
//  gdy użytkownik wprowadzi operator arytmetyczny inny niż +, -, * lub /.
//
    public final String plus = "+";
    public final String minus = "-";
    public final String multiply = "*";
    public final String divide = "/";

    public double Calculator(double a, double b, String operator) {
        double result = 0;

        switch (operator) {
            case plus:
                result= a + b;
            break;
            case minus:
                result = a - b;
            break;
            case multiply:
                result = a * b;
            break;
            case divide:
                if (b == 0) {
                    throw new ArrayStoreException("Nie można dzielić przez 0 !");
                }
                result = a / b;
                break;
                default:
                    throw new UnknownOperatorException ("Wykorzystujesz niezydentyfikowany operator arytmetyczny");



        }
        return result;

    }


}
