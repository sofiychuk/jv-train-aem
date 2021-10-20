package animalAll;

class Horse extends Animal {
    public Horse(String food, String location, String animalName) {
        super(food, location, animalName);
    }
    @Override
    void makeNoice(){
        System.out.println("As usual horses says: Igogo!");
    }
    void eat (){
        System.out.println("Horses eat: " + food);
    }

}
