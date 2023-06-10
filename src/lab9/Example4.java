package lab9;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2: "+e);
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("End");
    }
}

//Пример 4. Перехват исключения подходящим классом.