package lab9;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2 " +e);
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("End");
    }
}
//Пример 3. Перехват исключения подходящим классом.