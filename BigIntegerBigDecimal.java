package pl.sda.javastart;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main (String[] args) {
        BigInteger bI = new BigInteger("432235345435");
        BigInteger newBi = new BigInteger("24312412412");
        System.out.println(bI.add(newBi));

        double x = 0.02;
        double y = 0.03;
        double z;
        z = x - y;
        System.out.println(z);

        BigDecimal xx = new BigDecimal("0.02");
        BigDecimal yy = new BigDecimal("0.03");
        BigDecimal zz = xx.subtract(yy);
        System.out.println(zz);

        BigDecimal xxx = new BigDecimal(x);
        BigDecimal yyy = new BigDecimal(y);
        BigDecimal zzz = xxx.subtract(yyy);
        System.out.println(zzz);

        BigDecimal xxxx = BigDecimal.valueOf(x);
        BigDecimal yyyy = BigDecimal.valueOf(y);
        BigDecimal zzzz = xxxx.subtract(yyyy);

        System.out.println(zzzz);

    }
}
