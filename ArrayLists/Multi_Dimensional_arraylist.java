import java.util.*;

public class Multi_Dimensional_arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();// yaha Arraylist ko arrraylist me store kia he .isko
                                                                   // parent arraylist samajh lo jinko godi me aa
                                                                   // kr child ArrarL. bethe ge

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);

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
