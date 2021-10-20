package animalAll;

public class Animal {
    String food, location, animalName;

    public Animal(String food, String location, String animalName) {
        this.food = food;
        this.location = location;
        this.animalName = animalName;
    }
    void makeNoice (){
        System.out.println("As usual animal says:");
    }
    void eat (){
        System.out.println("Animal eat: " + food);
    }
    void sleeping (){
        System.out.println("Animal are sleeping");
    }
    String getFood() {
        return food;
    }
    String getAnimalName(){
        return animalName;
    }
    String getLocation(){
        return location;
    }
    public static void main(String[] args) {
        Animal animal1 = new Cat("canned food", "house", "Baksik");
        Animal animal2 = new Dog("bone", "doghouse", "Laptik");
        Animal animal3 = new Horse("grace", "freedom", "Spirit");
        DoctorAibolit doctor1 = new DoctorAibolit("Dulitl");

        Animal[] allAnimals = {animal1, animal2, animal3};
        for (Animal animal : allAnimals){
            doctor1.treatAnimal(animal);
        }

    }
}
