package lab11.task4;

import lab11.Example6_1;


    public class LinkedList {
        private Example6_1.Node head;

        public LinkedList() {
            this.head = null;
        }

        public void addFirst(int value) {
            head = new Example6_1.Node(value, head);
        }

        public void printList() {
            Example6_1.Node ref = head;
            while (ref != null) {
                System.out.print(" " + ref.value);
                ref = ref.next;
            }
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addFirst(3);
            list.addFirst(2);
            list.addFirst(1);
            list.printList();
        }
    }
