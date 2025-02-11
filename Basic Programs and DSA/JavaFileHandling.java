
/*import java.io.*;

public class java_file_handling {
    public static void main(String args[]) throws IOException{
        System.out.print("the program for file handling ");
        /*File f = new File("C:\\Users\\DELL\\Desktop\\Pankaj Ranher\\Java Programing\\byPankajInJava.txt");
        try{
            f.createNewFile();
        }
        catch(IOException i){
            System.out.println("created successfully");
        }*/


            // file writing in java//

       /*  try{
            FileWriter file = new FileWriter("C:\\Users\\DELL\\Desktop\\Pankaj Ranher\\Java Programing\\javaFileWriting.txt");
            try{
                file.write("the file writen by the file writing in java");
            }
            finally{
                file.close();
            }

        }
        catch(IOException i){
            System.out.println("the exception handeled");
        }*/

        // file readiong in java  //

        /*try{
            FileReader file1 = new FileReader("C:\\Users\\DELL\\Desktop\\Pankaj Ranher\\Java Programing\\New Text Document.txt");
            try{
                int i;
                while((i =file1.read()) !=-1){
                    System.out.print((char)i);

                }
            }
            finally{
                file1.close();
            }
        }
        catch(IOException i){
            System.out.println(i);
        }*/


        /*practice */                                       
    /*    try{
            FileReader f = new FileReader("C:\\Users\\DELL\\Desktop\\Pankaj Ranher\\Java Programing\\Fileread.txt");
            try{
                int i;
                while((i = f.read())!=-1){
                    System.out.print((char)i);

                }
            }
            finally{
                f.close();
            }
        }
        catch(IOException E){
            System.out.println(E);
        }  


    
    }
    
}
*/




import java.io.*;

public class JavaFileHandling {
    public static void main(String[] args) {
        System.out.println("The program for file handling");

        // File reading example
        try (FileReader reader = new FileReader("C:\\Users\\DELL\\Desktop\\Pankaj Ranher\\Java Programing\\Fileread.txt")) {
            int i;
            System.out.println("Reading from file:");
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println(); // New line after reading
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}