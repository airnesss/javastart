package pl.sda.javastart.Wlasne;

import java.math.BigDecimal;

public class BigDecimalCwiczenie {
    public static void main(String[] args) {
        BigDecimal marcin = new BigDecimal(8920382);
        BigDecimal natalia = new BigDecimal(9039222);
        System.out.println(marcin.add(natalia));

    double a = 0.01;
    double b = 0.02;
    double z;
    z = a + b;
        System.out.println(z);
        BigDecimal x = new BigDecimal(0.80);
        BigDecimal y = new BigDecimal(0.02);
        BigDecimal p = x.subtract(y);
        System.out.println(p);

        BigDecimal xx = new BigDecimal(a);
        BigDecimal yy = new BigDecimal(b);
        BigDecimal zz = xx.add(yy);
        System.out.println(zz);

        BigDecimal xxx = BigDecimal.valueOf(a);
        BigDecimal yyy = BigDecimal.valueOf(b);
        BigDecimal zzz = BigDecimal.valueOf(z);
        System.out.println(zzz);
}
}
