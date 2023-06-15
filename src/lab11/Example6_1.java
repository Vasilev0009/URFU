package lab11;

public class Example6_1 {
    public static class Node {
        public int value; // значение
        public Node next; // поле-ссылка (указатель) на следующий узел

        public Node(int value, Node next) { // конструктор класса
            this.value = value;
            this.next = next;

        }
    }
    public static void main(String[] args) {
        // создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0,null); // 0-й узел - будет головой в списке
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null); // последний узел - будет хвостом в списке
        // связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        // вывод списка с использованием вспомогательной переменной ref,
        // соответствующей текущему значению ссылки при прохождении по списку
        Node ref = node0;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

//Пример 6. Построить однонаправленный список из предварительно созданных независимых элементов (узлов),
//у которых значением поля будет целое число, равное номеру элемента, и вывести значения полей на экран.