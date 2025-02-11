import java.util.Random;

public class From_Pankaj{
    public static void main(String[] args) {
        // Initialize a random number generator
        Random random = new Random();

        // Create a new line space at the top
        for (int i = 0; i < 85; i++) {
            System.out.println();
        }

        // Loop through 1000 iterations
        for (int i = 1; i <= 1000; i++) {
            // Generate a random number of spaces
            int count = random.nextInt(100) + 1;
            StringBuilder space = new StringBuilder(count);

            // Append spaces to the space string
            for (int j = 0; j < count; j++) {
                space.append(' ');
            }

            // Determine which message to print
            if (i % 10 == 0) {
                System.out.println(space.toString() + "🎂Happy Birthday sir!");
            } else if (i % 9 == 0) {
                System.out.println(space.toString() + "🎂");
            } else if (i % 8 == 0) {
                System.out.println(space.toString() + "🎉");
            } else if (i % 7 == 0) {
                System.out.println(space.toString() + "🍫");
            } else if (i % 6 == 0) {
                System.out.println(space.toString() + "Happy Birthday sir!");
            } else if (i % 5 == 0) {
                System.out.println(space.toString() + " ");
            } else {
                System.out.println(space.toString() + "🔸");
            }

            // Sleep for 200 milliseconds
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}