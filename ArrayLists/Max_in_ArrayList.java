import java.util.*;

public class Max_in_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add Operation
        list.add(11);
        list.add(50);
        list.add(265);
        list.add(44);
        list.add(57);
        list.add(61);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {//O(n)
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            //or
            max = Math.max(max,  list.get(i));
        }
        System.out.println("maximum is :" + max);
}
}
