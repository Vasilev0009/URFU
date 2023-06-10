package lab9;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("CATCH ERROR:  " + e);
        }
        System.out.println("End");
    }

}

//Пример 2. Исключение перехвачено перехватчиком предка.