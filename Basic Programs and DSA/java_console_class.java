import java.io.*;
public class java_console_class {
    public static void main(String arg[]){
        char ch[];
        System.out.println("the java program for console class");
        Console pankaj = System.console();
        System.out.println("enter the user name");
        String str = pankaj.readLine();
        System.out.println("Enter the password");
        ch = pankaj.readPassword();
        String a = String.valueOf(ch);

        System.out.println("the username of the candidate is ::"+str);
        System.out.println("the password of the user is "+ a);


    }
    
}
