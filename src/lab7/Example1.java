package lab7;
//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.
class Example1 {
    public static void main(String[] args) {
       SuperClass test = new SuperClass("передал в конструктор сеперкласса");
        System.out.println(test);
        SubClass testSubClass = new SubClass("передал в конструктор подкласса");
        System.out.println(testSubClass);
        SubClass testSubClass2 = new SubClass("передал в конструктор подкласса", "где два параметра");
        System.out.println(testSubClass2);
    }
}
class SuperClass{
     private final String text;
    protected SuperClass(String text){
        this.text = text;
    }
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
               "text = " + text;
    }

    String getText() {
        return text;
    }
}

class SubClass extends SuperClass {
    private String subText;

    protected SubClass(String text) {
        super(text);
    }

    protected SubClass(String text, String subText) {
        super(text);
        this.subText = subText;
    }

    @Override
    public String toString() {
        if (subText == null) {
            return "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "text = " + getText();
        }
        else {
            return "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "text = " + getText() + "\n" +
                    "subText = " + subText;
        }

    }
}