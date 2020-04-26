import java.util.*;
import java.io.*;
import math.io.*;
import java.lang.*;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        char operand = sc.next().charAt(0);
        long b = sc.nextLong();
        
        long ans = 0;
        if(operand == '+'){
                ans = a + b;
        }
        else if(operand == '-'){
                ans = a - b;
        }
        else if(operand == '*'){
                ans = a * b;
        }
        else if(operand == '/'){
                ans = a / b;
        }
        else if(operand == '%'){
                ans = a % b;
        }
        else if(operand == '^'){
            ans = (int)Math.pow(a,b);
        }
        else{
                System.out.println("Enter a valid operand.");
        }
        System.out.println(a+" "+operand+" "+b+" = "+ans);
    }
}