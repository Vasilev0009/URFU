package lab11;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        int result;
        if(n==1) return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }
}
//Пример 4. Вычислить факториал числа n с использованием рекурсии.
//Факториал числа n (обозначается n!) – произведение всех натуральных чисел от 1 до n включительно: n!=1*2*…*n.
//Пример 5!=1*2*3*4*5 =4!*5. Можно записать n!=(n-1)!*n.