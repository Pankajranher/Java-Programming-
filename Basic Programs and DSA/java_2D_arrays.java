import java.util.Scanner;
public class java_2D_arrays {
    public static void main(String arg[]){
        System.out.println("this program is for 2D arrays");
        Scanner sc = new Scanner(System.in);
        int[][] marks;
        marks=new int[5][4];
        System.out.print("Enter row element::");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                marks[i][j] =sc.nextInt();
            }
            
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
            System.out.print(marks[i][j] + " ");

        }
        System.out.println();
    }
    
    System.out.print("Enter the element which you ant to find: ");
    int x = sc.nextInt();
    for(int i = 0; i< 5; i++){
        for(int j = 0;j<4;j++){
            if( marks[i][j]==x){
                System.out.println("element found");
                break;
            }
        
        }
    }
    }
}
