public class java_exception_hamdling {
    public static void main(String ag[]){
        System.out.println("this is for exception handling");

        try {
            int a = 10,b = 0, c;
            c = a / b;
            System.out.println("the dividation is "+ c);
            
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("the exception is handeled successfully");
    }

}