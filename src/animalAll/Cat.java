package animalAll;

class Cat extends Animal{
    public Cat(String food, String location, String animalName) {
        super(food, location, animalName);
    }
    @Override
    void makeNoice(){
        System.out.println("As usual cats says: Meow!");
    }
    void eat (){
        System.out.println("Cats eat: " + food);
    }
}