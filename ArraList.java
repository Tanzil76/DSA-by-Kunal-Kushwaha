import java.util.ArrayList;

public class ArraList {
    public static void main(String[] args) {
        // wrapper classes
//    Integer i = Integer.valueOf(4);
//    System.out.println(i);
//    Float f = Float.valueOf(4.5);
//    System.out.println(f);

    ArrayList<Integer> l1 = new ArrayList<>();

    // add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);

    // get an element at index i
    System.out.println(l1.get(1)); // 6

    // print with for loop
    for (int i = 0; i < l1.size(); i++) {
        System.out.println(l1.get(i)); // 5, 6, 7, 8
    }

    // printing the array list directly
    System.out.println(l1); // [5, 6, 7, 8]

    // adding element at some index i 
    l1.add(1, 100);
    System.out.println(l1);
    
    }
}
