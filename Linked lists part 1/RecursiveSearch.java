import java.util.*;

public class RecursiveSearch {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;// java isse default 0 value dega

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {// add in middle
        if (idx == 0) {// means we want to add something on head
            addFirst(data);// yaha size++ iss lie nahi kia because addFirst() me already ho gya size++,
                           // yaha likha tho double time size++ hoga
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int helper(Node head, int key){//this is our actual recursive function O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }


    public void print() { // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        RecursiveSearch ll = new RecursiveSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();


        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
        System.out.println("LL size = " + ll.size);




    }
}
