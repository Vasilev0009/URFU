package lab9;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
//            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("End");
    }
}
//Пример 5. Исключение не перехвачено.