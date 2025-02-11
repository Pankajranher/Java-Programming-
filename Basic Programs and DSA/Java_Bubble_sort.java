public class Java_Bubble_sort {
    public static void main(String args[]){
        System.out.println("This is the bubble sort in sorting ");
        int arr[] = {2,1,5,4,8,7};
        System.out.println(arr[0]);
        System.out.println(arr.length);
        for(int i = 0; i < arr.length-1; i++){
           for(int j = 0; j < arr.length-i-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i+1] = arr[i];
                arr[i+1] =temp;

            }
           }
        }
    }
}
