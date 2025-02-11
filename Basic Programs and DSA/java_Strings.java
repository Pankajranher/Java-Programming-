
import java.util.Scanner;

public class java_Strings {
    public static void main(String arg[]){
        System.out.println("this is only for string in java");
        Scanner sc= new Scanner(System.in); 
/*      String marks = "Ranher ";                                                                 //   normal string entered
        System.out.println(marks);

        String str = new String("this is the manual enterd string");                                 //   by creating object
        System.out.println(str);

        System.out.print("enter your name::");                                                     //   from user
        String name = sc.nextLine();
        System.out.println("your name is "+name);        */



        // example of concatination                                                                    // concatination
        String name1 = " Pankaj";
        String name2 = "Ranher";
        String spaces = " ";
        System.out.println("the concatination name of the given string is "+name1 + spaces + name2);

        String firstName = "parbhani";
        String LastName = "Pedgaon";
        String gap = " ";
        String FStrin = firstName +  gap + LastName ;   
        System.out.println(FStrin);   
        

        
        // examples of length function                                                                 // length function
        name2.length();
        System.out.println(name2.length());
        int  len = firstName.length();
        System.out.println("length of firstName is ::"+len);
        firstName.length();
        LastName.length();
        FStrin.length();
        System.out.println("the length of firstName::"+firstName.length() + "\nThe length of LastName::"+ LastName.length()+"\n the Length of Fstrin::" +  FStrin.length());
                    // output::::
                    // length of firstName is ::8
                    // the length of firstName::8
                    // The length of LastName::7
                    // the Length of Fstrin::16



        // Example of charAt
        System.out.println("The charector is at 6 position is "+firstName.charAt(6));
                    // output::::
                    // The charector is at 6 position is n

        for(int i = 0; i < FStrin.length(); i++){
            System.out.println(i+ " is the index of " +FStrin.charAt(i));
        }
                    // output::::
                    // 0 is the index of p
                    // 1 is the index of a
                    // 2 is the index of r
                    // 3 is the index of b
                    // 4 is the index of h
                    // 5 is the index of a
                    // 6 is the index of n
                    // 7 is the index of i
                    // 8 is the index of
                    // 9 is the index of P
                    // 10 is the index of e
                    // 11 is the index of d
                    // 12 is the index of g
                    // 13 is the index of a
                    // 14 is the index of o
                    // 15 is the index of n
    


        //Example of compareTo()           
        String Str1 = "Maharashtra";
        String Str2 = "Marathwada";
        System.out.println("String 1 length is "+Str1.length());
        System.out.println("String 2 length is "+Str2.length());
        if(Str1.compareTo(Str2)==0){
            System.out.println("the string is same ");
        }
        else{
            System.out.println("the string is not same ");
        }
                    // output:::
                    // the string is not same



        //.substring() function
        String sentence = "Hello my name is pankaj";
        System.out.println(sentence.length());
        System.out.println(" the returned substring is "+sentence.substring(5,23));
                    // output:::
                    // 23
                    // the returned substring is  my name is pankaj


        //.toUpperCase() /*from lower to upper*/
        System.out.println("the given string is in uppercase is"+sentence.toUpperCase());
       
        // .toLowerCase() /*from upper to lower*/
        String sentence2 = "I AM RECENTLY COMPLETED B. TECH ";
        System.out.println("the given string is in uppercase is"+sentence.toLowerCase());
       
        // .equals()
        if(sentence.equals(sentence2)){
            System.out.println("ysa both the strings are same");
        }
        else{
            System.out.println("Not same both the strings");
        }

    }
}





        //strings are IMMUMATABLE means no change once declare
        //   nextLine and nextInt is important 

        /*concatination Joining the two strings*/
        // in concatination it is used for adding the two strings by using '+' operator

        /* .length()*/
        // for printing the length of sentence or string this function is used

        /*charAt function */
        //it gives the charecter when we gives it a index of that charector
        //it use for acess the perticular charector

        /*.compareTo function */
        //it is use to compare the two strings
        // if String1 < string2 :: returns +ve value
        // if String1 = string2 :: returns 0 value
        // if String1 > string2 :: returns -ve value
        // we can compare two strings by using equal to also but it not works somewhere

        /*.substring() function */
        //this function is used to take a part of string from the senteence or string
        //if we want just any name from a sentence then this function is used


        /* .toUpperCase*/  //- to convert string to uppercase
        /* .toLowerCase*/  //- to convert string to lowercase

