class cars{
    public static cars punch;
    String colour ="red";
    int height = 6;

    public void Fast(){
        System.out.println("The car runs faster");
    }
    public void Medium(){
        System.out.println("The car runs medium");
    }
    public void slow(){
        System.out.print("the car runs slow");
    }

}
public class java_Class_and_obj{
    public static void main(String args[]){
        cars punch = new cars();
        cars.punch.Fast();
        cars.punch.Medium();
    }
}
