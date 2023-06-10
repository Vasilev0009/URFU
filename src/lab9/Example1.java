package lab9;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            throw  new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("CATCH ERROR:  "+ e);  // исключение обработано
        }
        System.out.println("End");
    }

}

//Пример 1. Сгенерировано и перехвачено RuntimeException.