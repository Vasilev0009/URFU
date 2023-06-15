package lab11.task4;

import lab11.Example6_1.Node;

public class Tail {
    private Node head;
    private Node tail;

    public Tail() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int value) {
        if (head == null) {
            tail = new Node(value, null);
            head = tail;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
    }

    public void printList() {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public static void main(String[] args) {
        Tail list = new Tail();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
    }
}