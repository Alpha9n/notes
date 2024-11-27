package local.hal.sa31.java.lesson2.ex1;

public class CallAnimals2 {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Dog();
        pets[1] = new Cat();
        pets[2] = new Pig();
        pets[0].setName("ポチ");
        pets[1].setName("たま");
        pets[2].setName("とんこ");

        for (Animal pet : pets) {
            String name = pet.getName();
            String call = pet.call();
            System.out.println(name + ": " + call);
        }
        System.out.println("----------------");
//        pets[2].eat();
        pets[2].speak();
    }
}
