package lab9;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
//      } catch (RuntimeException e) { //Т.к. RuntimeException наследуется от Exception компилятор выдаст ошибку:
                                       // Exception 'java.lang.RuntimeException' has already been caught
            System.out.println("3");
        }
        System.out.println("4");
    }
}
//Пример 6. Последовательность перехвата должна соответствовать иерархии классов исключений.
//Предок не должен перехватывать исключения раньше потомков. Указанный пример выдает ошибку компилятора.
//Программу запустить невозможно.