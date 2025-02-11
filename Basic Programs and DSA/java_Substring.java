public class java_Substring {
    public static void main(String args[]){
        System.out.println("This is for the Stringbuilder ");
        StringBuilder sb = new StringBuilder("my name is pankaj");
        System.out.println(sb);

        // inseert
        /*this is use for incert the letter or charector in string
         at any position  below example*/
        sb.insert(0, 'n');
        System.out.println(sb);

        //delete 
        /*this function is used for delete the charecter from the string or 
         by using this we can delete the perticular index to other end index */
        sb.delete(8,14);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("H");
        System.out.println(sb1);
        //append
        /*this is used to add the letter or charector at the end of the string
         * this is fast and made only changes in same string 
         */
        sb1.append('e');
        System.out.println(sb1);
        sb1.append('l');
        System.out.println(sb1);
        sb1.append('l');
        System.out.println(sb1);
        sb1.append('o');
        System.out.println(sb1);
    }
}
