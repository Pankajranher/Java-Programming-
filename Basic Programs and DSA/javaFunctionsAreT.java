import java.util.*;
public class javaFunctionsAreT {
    static void Triangle(double Base,double Height){
        double area = 0.5 * Base * Height;
        System.out.println("The area of the triangle is "+area);
    }
    public static void main(String args[]){
        System.out.println("wap ask the user enter base height calculate area of the traingle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double Base = sc.nextDouble();
        System.out.println("Enter the height of the triangle");
        double Height = sc.nextDouble();
        Triangle(Base,Height);
    }
}
