package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("487943873487595893");
        BigInteger newBI = new BigInteger("948659487958750");
        System.out.println(bI.add(newBI));

        double x = 0.02;
        double y = 0.03;
        double z;
        z = x - y;
        System.out.println(z);

        BigDecimal xx = new BigDecimal("0.02");
        BigDecimal yy = new BigDecimal("0.03");
        BigDecimal zz = xx.subtract(yy);

        BigDecimal xxx = new BigDecimal(x);
        BigDecimal yyy = new BigDecimal(y);
        BigDecimal zzz = xxx.subtract(yyy);
        System.out.println(zzz);


        System.out.println(xx.subtract((yy)));

        BigDecimal xxxx = BigDecimal.valueOf(x);
        BigDecimal yyyy = BigDecimal.valueOf(y); // dla bigdecimal stosowac VALUEOF !!
        BigDecimal zzzz = BigDecimal.valueOf(z);
        System.out.println(zzzz);


    }
}
