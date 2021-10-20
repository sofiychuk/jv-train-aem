package animalAll;

class Dog extends Animal{
    public Dog(String food, String location, String animalName) {
        super(food, location, animalName);
    }
    @Override
    void makeNoice(){
        System.out.println("As usual dogs says: Woof!");
    }
    void eat (){
        System.out.println("Dogs eat: " + food);
    }
}
