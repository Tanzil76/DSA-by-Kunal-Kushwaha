/* Array - it is a collection of your data types either primitives , objects or complex data types stores in an array. */

public class Array{
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Md Tanzil";

        // Q: store 5 roll numbers 
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int[];
        // or directly
        int[] rnos2 = {23 , 12 , 45 , 32 , 15};

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[]; // initialisation: actually here object is being created in the memory(heap).
    }
}