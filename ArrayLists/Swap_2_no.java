import java.util.*;

public class Swap_2_no {

    public static void swap(ArrayList<Integer> list, int idx1 , int idx2) {
        int temp  = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add Operation
        list.add(11);
        list.add(50);
        list.add(265);
        list.add(44);
        list.add(57);
        list.add(61);

        int idx1= 1, idx2 = 3;
        System.out.println(list);
        swap(list ,idx1, idx2);
        System.out.println(list);
}
}
