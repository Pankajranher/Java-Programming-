

public class java_polymorphism {
    public static void main(String args[]){
        System.out.println("the program for polymorphism in java");
        calculator pankaj = new calculator();
        pankaj.addition();
        pankaj.addition(25,5);
        pankaj.addition(25, 25, 25);
        calculator mine = new calculator();
        mine.addition(4, 6, 5);
    }
    
}

class calculator{
    void addition(){
        int a = 10,b = 20, c;
        c = a + b ;
        System.out.println("the addition "+c);
    }

    void addition(int x,int y){
        int z = x + y;
        System.out.println("the addition with two parameters "+z);  
    }

    void addition(int p, float q, float r){
        float s = p + q + r;
        System.out.println("the addition of the three parameters "+s);

    }
}
