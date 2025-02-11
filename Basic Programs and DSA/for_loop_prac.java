/*1Q) For example
# print it is a even number and odd number
# you need to generate 3 random number*/

import java.util.Scanner;
public class for_loop_prac{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what ia problem going ");
        System.out.println("okk, please enter the number between 1 to 100 ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.println("the entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }

         
            for(int i=0;i<20;i++){
            System.out.println("this is for loop int the number");
            int num = sc.nextInt();
            int square = num * num;
            System.out.println("this is square "+square);

        } 



        //do while loop
        System.out.println("Enter the number which table you want");
        int num = sc.nextInt();
        int i=1;
        do{
           int table = num * i;
           System.out.println(+table);
           i = i + 1;
        }
        while(i<11);



        //for each loop
        int marks[] = {20,65,65,69,51,69};
        for(int each:marks){
            System.out.println(each +" ");
        }
    } 
}
