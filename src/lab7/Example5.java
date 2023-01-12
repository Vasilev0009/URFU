package lab7;
//Напишите программу, в которой есть суперкласс с защищенным текстовым полем, конструктор с текстовым параметром и метод,
//при вызове которого в консольном окне отображается название класса и значение поля. На основе суперкласса создаются
//два подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется защищенное целочисленное поле,
//там есть конструктор с двумя параметрами и переопределен метод для отображения значений полей объекта и названия класса.
//Во втором подклассе появляется защищенное символьное поле, конструктор с двумя параметрами и переопределен метод,
//отображающий в консоли название класса и значения полей. В главном методе создайте объекты каждого из классов.
//Проверьте работу метода, отображающего значения полей объектов, для каждого из объектов. Вызовите этот же метод через
//объектную переменную суперкласса, которая ссылается на объект производного класса.
public class Example5 {
    public static void main(String[] args) {

    SuperEx5 testEx5 = new SuperEx5("Строка суперкласса");
    testEx5.display();
    Sub1ClassEx5 test2Ex5 = new Sub1ClassEx5("Строка 1 подкласса", 45);
    test2Ex5.display();
    Sub2ClassEx5 test3Ex5 = new Sub2ClassEx5("Строка 2 подкласса", 'R');
    test3Ex5.display();
    SuperEx5 test4Ex5 = new SuperEx5(test2Ex5.textEx5);
    test4Ex5.display();
    SuperEx5 test5Ex5 = new SuperEx5(test3Ex5.textEx5);
    test5Ex5.display();
    }
}
class SuperEx5{
    protected String textEx5;
    SuperEx5(String newStr){
        this.textEx5 = newStr;
    }
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5);
    }
}
class Sub1ClassEx5 extends SuperEx5{
    protected int intEx5;

    public Sub1ClassEx5(String newStr, int newInt) {
        super(newStr);
        this.intEx5 = newInt;
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5 + ", Integer = " + intEx5);
    }
}
class Sub2ClassEx5 extends SuperEx5{
    protected char charEx5;

    public Sub2ClassEx5(String newStr, char newChar) {
        super(newStr);
        this.charEx5 = newChar;
    }
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5 + ", Char = " + charEx5);
    }
}