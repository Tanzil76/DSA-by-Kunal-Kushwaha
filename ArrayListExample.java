import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);

 //       list.add(67);
//        list.add(455);
//        list.add(391);
//        list.add(905);
//        list.add(95);
//        list.add(82);
//        list.add(59);
//        list.add(20);
//        list.add(25);
//        list.add(89);
//        list.add(97);

      //  System.out.println(list.contains(455));

//        System.out.println(list);

//        list.set(0 , 99);

//        System.out.println(list);

            // input
            for(int i = 0; i < 5; i++){
                list.add(in.nextInt());
            }
            // get item at any index
            for(int i = 0; i < 5; i++){
                System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
            }
    }
}
