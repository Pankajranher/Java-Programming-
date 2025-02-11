public class JavaVarArg {
    public static void main(String[] args) {
        System.out.println("This is the program for passing multiple arguments without declaring in the method parameter.");
        Calculator pankaj = new Calculator();
        pankaj.add(20, 25, 30);
    }
}

class Calculator {
    void add(int... a) {
        int sum = 0; // Moved sum inside the method to reset it for each call
        
        for (int x : a) {
            sum += x; // Simplified addition
        }
        
        System.out.println("The total addition of the numbers: " + sum);
    }
}



