package lab11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        System.out.println("Число " + n + " в двоичном варианте имеет вид:");
        getBinary(n);
    }
    public static void getBinary(int n){
        if(n <= 1) System.out.print(n);
        else{
            getBinary(n/2);
            System.out.print(n%2);
        }
    }
}
//2. Создать приложение с использованием рекурсии для перевода целого числа, введенного с клавиатуры,
//в двоичную систему счисления.
