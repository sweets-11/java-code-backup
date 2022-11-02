import java.util.*;

public class Multi_dimension_arral {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);// 1 2 3 4 5
            list2.add(i * 2);// 2 4 6 8 10
            list3.add(i * 3);// 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(2);// if we have to remove elements
        list2.remove(3);


        for (int i = 0; i < mainList.size(); i++) {// yaha mainList ka size 1 hi he isske 0th index pr list stored he
            // aur 1st index pr list2
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {// ye list ke ek-ek element ko print kra ra h aur fir list2 ke
                // ek- ek element ko
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);// ye 2D array vala structure form krta h
    }
}
