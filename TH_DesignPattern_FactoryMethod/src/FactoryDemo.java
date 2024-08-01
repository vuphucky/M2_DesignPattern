public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        Animal a1 = factoryAnimal.getAnimall("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = factoryAnimal.getAnimall("canie");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
