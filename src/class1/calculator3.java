package class1;

import java.util.Scanner;
public class calculator3
    {
    static int q =10;
    static int r =20;
    static int s,u;
    public static void main(String[]args)
     {
        System.out.println("The value of method"+plus(100,200));
        System.out.println("The value of method"+minus(500,400));
        System.out.println("The value of method"+div(300,100));
        System.out.println("The value of method "+multiply(20,10));
        dynamicValueEnter();
     }
    public static int plus(int x,int y)
     {
        int plusGlobalVariable= r+q;
        int plus= x+y;
        System.out.println("Addition of globalvariable"+plusGlobalVariable);
        dynamicValueEnter();
        System.out.println("Addition value of userentered value " +(s+u));
        return plus;
     }
    public static int minus(int l,int m)
     {
       int minusGlobalVariable= r-q;
        int minus= l-m;
        System.out.println("Subtraction value  of globalvariable"+minusGlobalVariable);
        dynamicValueEnter();
        System.out.println("Subtraction value of userentered value " +(s-u));
        return minus;
     }
    public static int div(int n,int o)
     {
        int divGlobalVariable= q%r;
        int div= n%o;
        System.out.println("Subtraction value  of globalvariable"+divGlobalVariable);
        dynamicValueEnter();
        System.out.println("Division value of userentered value " +(s/u));
        return div;
     }
    public static int multiply(int w,int z)
     {
       int multiplyGlobalVariable= q*r;
        int multiply= w*z;
        System.out.println("Subtraction value  of globalvariable"+multiplyGlobalVariable);
        dynamicValueEnter();
        System.out.println("multiplication value of userentered value " +(s*u));
        return multiply;
     }
    public static void dynamicValueEnter()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the value of firstVariable");
       s=scan.nextInt();
        System.out.println("enter the value of SecondVariable");
      u=scan.nextInt();
     }
}












