
class Area{
    double pi = 3.145;
     float areaOfCircle(float redius){
        System.out.println("The area of the cicle is "+redius*redius);
        return redius*redius;
    }

    public float areaOfSquare(float sides){
        return sides*sides*sides*sides;
    }

    public double areaOfTriangle(double base, double height){
        return base * height * pi;
    }


}
public class methodes {
    public static void main(String args[]){
        System.out.println("The program to print the area of the ");
        Area circle_c = new Area();
        circle_c.areaOfCircle(56);

        Area square = new Area();
        square.areaOfSquare(5);
        System.out.println(square.areaOfSquare(5));

        Area Triangle = new Area();
        System.out.println(Triangle.areaOfTriangle(46.2,50.3));


    }
}
