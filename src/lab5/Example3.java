package lab5;
//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.
public class Example3 {
    private int number1, number2;
    public Example3() {
        System.out.println("Конструктор по умолчанию");
    }
    //Конструктор с передачей одного аргумента
    public Example3(int number1){
        this.number1 = number1;
    }
    //Конструктор с передачей двух аргументов
    public Example3(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
}
