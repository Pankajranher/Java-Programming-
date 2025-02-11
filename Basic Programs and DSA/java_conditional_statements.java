import java.util.Scanner;
public class java_conditional_statements {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    // this is if-else condition 

     /*System.out.println("Practice of conditional statements");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = sc. nextLine();
    System.out.println("Enter your age ");
    int age;
    age =sc.nextInt();
    if(age >= 18){
        System.out.println("the age is greater then 18 \n you are eligible for voting "+name);
    }
    else{
        System.out.println("Sorry you are not eligible for votting");
    }*/


    /*
    System.out.println("Enter your grades");
    int grade = sc.nextInt();
    if(grade > 90 && grade < 100){
        System.out.println("Execelent");
    }
    else if(grade > 75 && grade < 90){
        System.out.println("verry good");
    }
    else if(grade > 35 && grade <75){
        System.out.println("Avarage");
    }
    else{
        System.out.println("try again");
    }
            */

            
/////////ex 2
/* 
            int num1, num2,num3;
            System.out.println("Enter the first number");
            num1 = sc.nextInt();
            System.out.println("Enter the second number");
            num2 = sc.nextInt();
            System.out.println("Enter the third number");
            num3 = sc.nextInt();

            if(num1 > num2 && num1 > num3){
                System.out.println("the first number is greater "+num1);
            }
            else if(num2 > num1 && num2 > num3){
                System.out.println("second no. is greater "+num2 );
            }
            else{
                System.out.println("third no is greater "+num3);
            }*/



            /// Switch statements 
            System.out.println("This is a simple calculator in jva programing");
            System.out.println("Enter first value");
            int val1 = sc.nextInt();
            System.out.println("Enter second value");
            int val2 = sc.nextInt();
            System.out.println("Great!!!");
            System.out.println("Enter enter your chooice\n from");
            System.out.println("Enter '1' for ADDITION" );
            System.out.println("Enter '2' for SUBSTRACTION");
            System.out.println("Enter '3' for MULTIPLICATION");
            System.out.println("Enter '4' for DIVIDATION ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                int add = val1 + val2;
                System.out.println("the ADDITION of the number is: "+ add);
                break;

                case 2:
                int sub = val1 - val2;
                System.out.println("the ADDITION of the number is: "+ sub);
                break;
            
                case 3:
                int mult = val1 * val2;
                System.out.println("the MULTIPLICATION of the number is: "+mult);
                break;

                case 4:
                int div = val1 / val2;
                System.out.println("the DIVIDATION of the number is: "+div );
                break;


            }
    }
}
