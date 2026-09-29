import java.util.*;

class Basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner (System.in);
        // String s = sc.next();
        // int n = sc.nextInt();

        
        int a = 5;
        System.out.println(a);
        //variable is a container that holds a value. In this case, the variable 'a' is of type int and holds the value 5. 
        // You can use variables to store data that can be used and manipulated throughout your program.
        //Byte range is -128 to 127
        System.out.println("Byte range is "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        //Short range is -32,768 to 32,767
        System.out.println("Short range is "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        //long range is -10^18 to 10^18
        System.out.println("Long range is "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        //float range is .10^7 
        System.out.println("Float range is "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        //double range is .10^15
        System.out.println("Double range is "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        //Boolean is true or false 
        // System.out.println(n);
        // System.out.println(s);
        // Boolean b = true;
        // System.out.println(b==false); 
        sc.close();
        //Data types are two types primitive and non-primitive. 
        // Primitive data types are int, long, float, double, boolean, char, byte, short. 
        // Non-primitive data types are String, Arrays, C, Interfaces.
        // The difference between primitive and non-primitive data types is that ,
        // primitive data types are predefined by the programming language and are named by a reserved keyword. 
        // Non-primitive data types are created by the programmer and are not defined by the programming language.
    }
    
}
