package lab11;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }
    public static int fact(int n){
//        System.out.print(n +" ");
        if(n==0) return 0;
        else if(n==1) return 1;
        else { int res = fact(n-2) + fact(n-1);
            System.out.print(res +" ");
            return res;
        }
    }
}
//Вывести число Фибоначчи, заданное его номером в последовательности.
//Последовательность Фибоначчи формируется так: нулевой член последовательности равен нулю,
//первый – единице, а каждый следующий – сумме двух предыдущих.