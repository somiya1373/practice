//day3
// public class Day3 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// create a singly linked list and perform basic operations like insertion, deletion, and traversal
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// public class Day3{
//     public static void main(String[] args) {
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         System.out.println("Linked List:" + head.data + " -> " + head.next.data + " -> " + head.next.next.data + " -> " + head.next.next.next.data);
//     }
// }

// Create a Singly Linked List and perform basic operations

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day3 {

    public static void main(String[] args) {

        // Creating Linked List: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        traverse(head);

        // Insertion
        head = insertAtEnd(head, 5);
        System.out.println("\nAfter Insertion at End:");
        traverse(head);

        // Deletion
        head = deleteNode(head, 3);
        System.out.println("\nAfter Deleting 3:");
        traverse(head);
    }

    // Traversal
    public static void traverse(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Insert at End
    public static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    // Delete a Node by Value
    public static Node deleteNode(Node head, int key) {

        if (head == null) {
            return null;
        }

        // If head itself needs to be deleted
        if (head.data == key) {
            return head.next;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // Key not found
        if (current == null) {
            return head;
        }

        // Delete node
        prev.next = current.next;

        return head;
    }
}