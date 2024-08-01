public class FactoryAnimal {
    public Animal getAnimall(String type){
        if ("canie".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
