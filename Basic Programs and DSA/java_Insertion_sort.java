import java.util.Scanner;
public class java_Insertion_sort {
    public static void main(String arg[]){
        System.out.println("this is selection sort");
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arry elements");
        for(int i=0; i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the arrays");
        for(int i=0;i<5;i++){
            System.out.print(" "+arr[i]);
        }
    //now sorting the array by insertion sort
    for (int i=1; i<5;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;

    }
    for(int i=0;i<5;i++){
        System.out.println(arr[i]);

    }
   

    }
    
}
