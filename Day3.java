//day3
// public class Day3 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// create a singly linked list and perform basic operations like insertion, deletion, and traversal
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Day3{
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        System.out.println("Linked List:" + head.data + " -> " + head.next.data + " -> " + head.next.next.data + " -> " + head.next.next.next.data);
    }
}