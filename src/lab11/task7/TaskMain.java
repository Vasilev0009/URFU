package lab11.task7;

public class TaskMain {
    public static void main(String[] args) {
        TaskProject head = new TaskProject(1, null);
        System.out.println(head);

        head.createHead(2);
        System.out.println(head);

        head.createTail(3);
        System.out.println(head);

        head.AddFirst(4);
        System.out.println(head);

        head.AddLast(5);
        System.out.println(head);

        head.Insert(2, 6);
        System.out.println(head);

        head.RemoveFirst();
        System.out.println(head);

        head.RemoveLast();
        System.out.println(head);

        head.Remove(2);
        System.out.println(head);
    }
}
