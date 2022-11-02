import java.util.*;
public class Sort{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add Operation
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(15);
        list.add(16);

        System.out.println("unsorted :" + list);
        //Ascending order
        Collections.sort(list);
        System.out.println("Ascending :" + list);
        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending :" + list);
    }
}