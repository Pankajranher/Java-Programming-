

class claculator{
    int num1;
    int num2;

    public void addition(int a,int b){
        int c = a + b;
        System.out.println("addition of the two numbers is "+c);
        
    }

class adv_calculator extends claculator{
    int num3 = num1 + num2;

    public void tadd(int x,int y, int z){
        int p = x + y + z;
        System.out.println("addition of the three numbers is "+ p);
    }

    
}

}

public class java_inheritance1 {
    public static void main(String args[]){
        System.out.println("the program for the inheritance ");
        claculator pan = new claculator();
        pan.addition(12,23);

        adv_calculator refe = new adv_calculator();

    }
}
