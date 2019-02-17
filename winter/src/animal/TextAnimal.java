package animal;

public class TextAnimal {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("猫猫猫");
        one.setMonth(6);
        one.setSpecices("家猫");
        one.setWeight(30.5);

        one.run();
        one.eat();

        System.out.println("*******************");

    }
}
