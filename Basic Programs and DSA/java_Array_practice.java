import java.util.Scanner;
public class java_Array_practice {
    public static void main(String[] args) {
        System.out.println("this is the program for sort function in the java util package");
        int[] arr;
        Scanner sc = new Scanner(System.in);
        arr = new int[5];
        System.out.println("Enter the arrys elements");
        for (int i = 0; i<5;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // for (int i = 0;i<5;i++){
        //     System.out.println(arr[i]+" ");
        // }
        int max = arr[0];
        for (int i = 0; i<5;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the max value in the array is "+max);
    }
}
