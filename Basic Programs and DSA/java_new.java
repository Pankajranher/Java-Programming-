import java.util.Scanner;
public class java_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,size;
        System.out.println("hello WHAT IS THE SIZE OF ARRAY");
        size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println(arr);
        for(i = 0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Given array");
        for(i = 0;i<size;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println("\nTHANK YOU");

        int n = arr.length;
        System.out.println("the length of the array "+n);
        for(i = 0;i<size;i++){
            for(int j = 0;j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("Sorted ::");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
