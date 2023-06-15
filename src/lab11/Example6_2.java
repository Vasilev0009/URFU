package lab11;


public class Example6_2 {
    public static void main(String[] args) {
        // добавление элементов с перемещением головы (наращивание с головы)
        Example6_1.Node head = null; // начальное значение ссылки на голову

        for(int i=9;i>=0;i--){
            head = new Example6_1.Node(i, head);
        }
        // вывод элементов на экран
        Example6_1.Node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}

