import java.util.*;


public class Add_last_inLL {
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

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static void main(String[] args) {
            Add_last_inLL ll = new Add_last_inLL();
            ll.addLast(3);
            ll.addLast(4);
        }
}
