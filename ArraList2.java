// write a program to sort an ArrayList of Strings in descending order.

import java.util.ArrayList;
import java.util.Collections;

public class ArraList2 {

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        
        list.add("ArrayList");
        list.add("is");
        list.add("a");
        list.add("resizable");
        list.add("array");

        System.out.println("Original List: " + list);
        
        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order List: " + list);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println("Ascending order List: " + list);

    }
}
