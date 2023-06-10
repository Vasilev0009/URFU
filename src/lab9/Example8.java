package lab9;

public class Example8 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("Start");
                throw new RuntimeException();  //// исключение не будет перехвачано, т.к. нет соответствующего catch, будет выведена ошибка
            }
            finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}

//Пример 8. Генерация исключения в методе.