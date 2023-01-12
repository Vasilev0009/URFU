package lab7;
//Напишите программу, в которой использована цепочка наследования из трех классов. В первом классе есть открытое
//символьное поле. Во втором классе появляется открытое текстовое поле. В третьем классе появляется открытое
//целочисленное поле. В каждом из классов должен быть конструктор, позволяющий создавать объект на основе
// значений полей, переданных аргументами конструктору, а также конструктор создания копии.
public class Example4 {
    public static void main(String[] args) {
        System.out.print("Проверка первого класса: ");
        SuperClassEx4 test1 = new SuperClassEx4('T');
        System.out.println("символ: " + test1.getCharEx4());
        SuperClassEx4 copyTest1 = new SuperClassEx4(test1);
        System.out.println("Проверка созданного клона: " +copyTest1.getCharEx4());
        System.out.print("Проверка второго класса: ");
        SubClassEx4 test2 = new SubClassEx4('W', "подкласс 1 уровня");
        System.out.println("символ: " + test2.getCharEx4() + ", строка: " +test2.getStrEx4());
        SubClassEx4 copyTest2 = new SubClassEx4(test2);
        System.out.println("Проверка созданного клона: " +"символ: " + copyTest2.getCharEx4() +
                           ", строка: " +copyTest2.getStrEx4());
        System.out.print("Проверка третьего класса: ");
        SubSubClassEx4 test3 = new SubSubClassEx4('L', "подкласс 2 уровня", 8);
        System.out.println("символ: " + test3.getCharEx4() + ", строка: " +test3.getStrEx4() +
                ", число: " + test3.getIntegerEx4());
        SubSubClassEx4 copyTest3 = new SubSubClassEx4(test3);
        System.out.println("Проверка созданного клона: " +"символ : " + copyTest3.getCharEx4() +
                           ", строка: " +copyTest3.getStrEx4() + ", число: " + copyTest3.getIntegerEx4());
    }
}
class SuperClassEx4{
    public char charEx4;
    SuperClassEx4 (char newChar){
        this.charEx4 = newChar;
    }
    SuperClassEx4 (SuperClassEx4 copyClass){
        this.charEx4 = copyClass.charEx4;
    }
    public char getCharEx4() {
        return charEx4;
    }
}
class SubClassEx4 extends SuperClassEx4{
    public String strEx4;

    SubClassEx4 (char newChar,String newStr){
        super(newChar);
        this.strEx4 = newStr;
    }
    SubClassEx4 (SubClassEx4 copyClass){
        super(copyClass);
        this.strEx4 = copyClass.strEx4;
    }

    public String getStrEx4() {
        return strEx4;
    }
}
class SubSubClassEx4 extends SubClassEx4{
    public int integerEx4;

    SubSubClassEx4 (char newChar, String newStr, int newInt){
        super(newChar, newStr);
        this.integerEx4 = newInt;
    }
    SubSubClassEx4 (SubSubClassEx4 copyClass) {
        super(copyClass);
        this.integerEx4 = copyClass.integerEx4;
    }
    public int getIntegerEx4() {
        return integerEx4;
    }
}