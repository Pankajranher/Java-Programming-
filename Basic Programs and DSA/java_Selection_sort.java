public class java_Selection_sort {
    public static void main(String args[]){
        System.out.println("This is the bubble sort in sorting ");
        int arr[] = {2,1,5,4,8,7};
        System.out.println(arr);
        int size = arr.length;
        System.out.println("The sorting with using selection sort");
        System.out.println("The size of the arry is::"+size);
        
    // Selection sort
    for(int i=0;i<=size-1;i++){
        int min_i=i;
        for(int j=i+1;j<size;j++){
            if(arr[j]>arr[min_i]){
                min_i = j;
            }
        }
        int temp = arr[min_i];
        arr[min_i] = arr[i];
        arr[i]=temp;
    }
    System.out.println("the given arry is "+arr);
    System.out.println("the sorted elements :::");
    for(int i=0;i<size;i++){
    System.out.println(arr[i]);
    }
}
}
