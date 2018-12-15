package pl.sda.javastart.day1;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import com.sun.tools.jdi.SocketAttachingConnector;

import java.util.Date;

public class Main {
    public static void main (String[] args){
        System.out.println ("HelloWorld!");
        Date date = new Date();
        System.out.println (date.toString ());
        System.out.println(""+date);
        int number = 100;
        System.out.println ("Number " + number); // tu wystepuje konkatenacja

        System.out.println (2+3);
        System.out.println (2-4);
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2.0);
        System.out.println(100L/2);
        System.out.println(2f-3);
        System.out.println(5f/2);
        System.out.println(5d/2);
        System.out.println('A'+2);
        System.out.println('a'+2);
        System.out.println("a"+2);
        System.out.println("a"+"b");
        System.out.println('a'+'b');
        System.out.println("a"+'b');
        System.out.println("a"+'b'+3);
        System.out.println('b'+3+"a");
        System.out.println(9 %4);
        System.out.println(-5+8*6);
        System.out.println(""+5+8+6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8 % 3);

        System.out.println("Adam");
        System.out.println("Justyna");
        System.out.println("Krzysztof");

        System.out.println("Adam\nJustyna\nkrysztof");
        System.out.println("\\Adam\nJustyna\nkrysztof");

        System.out.println((false==false));
        System.out.println((false!=false));
        System.out.println(!true);
        System.out.println(2>4);
        System.out.println(3<5);
        System.out.println(3==3 && 3==4);
        System.out.println(3!=5 || 3==5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos"=="cos");
        System.out.println("cos" == new String ("cos"));






    }
}
