import java.util.Scanner;
import java.lang.Math;

public class Class1 {

    public static void main(String[] args) {
	   // write your code here
        // STRONGLY TYPED - COMPILED LANGUAGE
        System.out.println("Hello World!");
        // The value stored in a variable can be changed during program execution.
        //A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
        //In Java, all the variables must be declared before use.
        int a = 1;
        int b = 2;
        int zero = 0;
        int sum = a + b;
        /*
        Compile Time Errors:
        cannot change types to variable
         Incompatible types
        a = 3.0;
         Syntax Error
        A = 3;
        */
        //int rounds down
        System.out.println(a / b);
        System.out.println(a % b);
        a = 2;
        System.out.println(Math.pow(a, b));
        /*
        Runtime Error:
         Zero division error
        int zero_division = a / zero;
        System.out.println(zero_division);
        */

        //System.out.println(sum);

        double c = 1.5;
        double d = 2.4;
        double dSum = c + d;
        d = 1;
        d++;
        d *= c;

        System.out.println(dSum);

    }
}
