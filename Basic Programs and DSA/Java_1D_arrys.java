import java.util.Scanner;
class Java_1D_arrys{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("please this is for java programing arrays");
        // int marks[];
        int marks[] = new int[5];
        System.out.println("Enter the marks");
        
        for(i=0;i<5;i++){
            marks[i] = sc.nextInt();
            
        }
        System.out.println("the element are");
        for(i=0;i<5;i++){

            System.out.println(marks[i]);
        }
        
        System.out.println("Enter the number you want to find");
        int  j = sc.nextInt();
        boolean found=false;
        for(i=0;i<5;i++)
        {
            if (j==marks[i]){
                System.out.println("The element is  found is at the psition "+i);
                found=true;
                break;
            }
                
             
         }
            if(!found)
            {
                System.out.println("The element is not found ");
                
            }


        System.out.println("enter second arrys of printing the age of students");
        System.out.println("Enter the size of arrys");
        int size=sc.nextInt();
        int[] age ;
        age =new int[size];
        System.out.println("enter elements age");
        for(int k = 0; k < size; k++){
             age[k]=sc.nextInt();
        }
        System.out.println("the age of the studens");
        for(int k = 0; k < size; k++){
            System.out.println("age of student %d is %d"+age[k] );
        }
    }
}