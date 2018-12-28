package pl.sda.javastart.Wlasne;

import java.math.BigDecimal;
import java.math.BigInteger;

public class testowe {
    public static void main(String[] args) {
        System.out.println(false == false);
        System.out.println("coś".equals("cos"));
        System.out.println("coś" == new String("coś"));
        BigInteger Bart = new BigInteger("954890302");
        BigInteger Mart = new BigInteger("83992829");
        System.out.println(Bart.add(Mart));


        double a = 0.872;
        double b = 0.932;
        double x = a + b;
        System.out.println(x);

        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal xx = new BigDecimal(a + b);
        System.out.println(xx);

        BigDecimal aaa = new BigDecimal(0.872);
        BigDecimal bbb = new BigDecimal(0.932);
        BigDecimal xxx = aaa.add(bbb);
        System.out.println(aaa.add(bbb));

        BigDecimal aaaa = BigDecimal.valueOf(a);
        BigDecimal bbbb = BigDecimal.valueOf(b);
        BigDecimal xxxx = aaaa.add(bbbb);
        System.out.println(xxxx);




    }


    }







