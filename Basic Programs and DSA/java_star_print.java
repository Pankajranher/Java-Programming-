public class java_star_print {
    public static void main(String[] args) {
        System.out.println("the program to print the star patterns");
        for(int i = 1; i<=5; i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++)
            {
                System.out.println("*");
            }
            System.out.println("\n");
        }


        for(int i = 1; i>=5; i--)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++)
            {
                System.out.println("*");
            }
            System.out.println("\n");
    }
}
