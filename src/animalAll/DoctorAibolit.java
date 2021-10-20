package animalAll;

public class DoctorAibolit {
    String doctorName;

    public DoctorAibolit(String doctorName) {
        this.doctorName = doctorName;
    }

    void treatAnimal(Animal animal){
        System.out.println("Сейчас принимает доктор: " + doctorName);
        System.out.println("Задам парочку вопросов. Итак как звать сие милое создание?  - " + animal.getAnimalName());
        System.out.println("Ага, а где обычно находится?  - " + animal.getLocation());
        System.out.println("Ну и последний вопрос, что кушает Ваш " + animal.getAnimalName() + "? - " + animal.food);
    }
}
