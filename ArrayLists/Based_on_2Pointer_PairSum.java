import java.util.*;
public class Based_on_2Pointer_PairSum {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0; // left pointer
        int rp = list.size()-1;// right pointer

        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}
