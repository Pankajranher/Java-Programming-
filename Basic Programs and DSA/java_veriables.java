import java.util.Scanner;
public class java_veriables {
    public static void main(String arg[]){
    System.out.println("hello this is the program of veriables in java ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name::::");
    String name =sc.nextLine();
    System.out.println("the name is enter by the user is "+name);
    System.out.println("Enter your age");
    int age = sc.nextInt();
    if(age >= 18){
        System.out.println("this is voter");
    }
    else{
        System.out.println("not eligible for vot");
    }

    }
}
/*if you want to print the String and any sentance on screen
do following steps 
step 1: declare scanner class on top 
step 2: use syntsx for string printig
        String S_name = new String("this is the string entered by user");*/

/*for taking string from the user
 Syntax
    String S_name = sc.nextLine();
    (it scan the entered strings)
 */