package practice6;

public class Test {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();
        Cat cat = new Cat("Barsik");
        Student student = new Student("Sanzhar", 19);

        delpapa.servePizza(cat);
        delpapa.servePizza(student);
    }
}