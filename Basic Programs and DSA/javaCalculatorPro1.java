import java.util.*;
public class javaCalculatorPro1 {

    static void add(double num1,double num2){
        double addition = num1 + num2;
        System.out.println("Addition of the given number is " +addition);
    }

    static void sub(double num1,double num2){
        double substraction = num1 - num2;
        System.out.println("Substraction of the given number is " +substraction);
    }

    static void mult(double num1,double num2){
        double multiplication = num1 * num2;
        System.out.println("Multiplication of the given number is " + multiplication);
    }

    static void div(double num1,double num2){
        double dividation = num1 / num2;
        System.out.println("Dividation of the given number is " + dividation);
    }

    public static void main(String args[]){
       System.out.println("this is the simple calculator using functions and methods\n");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the First number ");
       double num1 =sc.nextDouble();
       System.out.println("Enter the Second number ");
       double num2 =sc.nextDouble();
       System.out.println("What you want perform from the following numbers");
       System.out.println("1. for addition\n 2. for substraction\n 3. for multiplication\n 4. for dividation \n");
       int ch = sc.nextInt();
       switch(ch){
        case 1:{
            add(num1,num2);
            break;
        }
        case 2:{
            sub(num1,num2);
            break;
        }
        case 3:{
            mult(num1,num2);
            break;
        }
        case 4:{
            div(num1,num2);
            break;
        }
       }
    }
}
