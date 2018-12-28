package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimalDwa {
    public static void main(String[] args){

        BigInteger aW = new BigInteger("9784392238292");
        BigInteger newAW = new BigInteger("974873239039");
        System.out.println(aW.add(newAW));

        double a = 0.025;
        double b = 0.56;
        double x = a + b;
        System.out.println(x);

        BigDecimal aaa = new BigDecimal(a);
        BigDecimal bbb = new BigDecimal(b);
        BigDecimal xxx = new BigDecimal(x);
        System.out.println(xxx);

        BigDecimal aa = new BigDecimal("0.025");
        BigDecimal bb = new BigDecimal("0.56");
        BigDecimal xx = aa.add(bb);
        System.out.println(xx);

        BigDecimal aaaa = BigDecimal.valueOf(a);
        BigDecimal bbbb = BigDecimal.valueOf(b);
        BigDecimal xxxx = aaaa.add(bbbb);
        System.out.println(xxxx);



    }
}
