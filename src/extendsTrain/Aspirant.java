package extendsTrain;

public class Aspirant extends Student{
    String sicenceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sicenceWork) {
        super(firstName, lastName, group, averageMark);
        this.sicenceWork = sicenceWork;
    }
    @Override
    int getScholarship() {
        return averageMark >= 5 ? 200 : 180;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Петя", "Угарный", "МЗД21", 5.7);
        Aspirant aspirant1 = new Aspirant("Дима", "Мощный", "МЭ32", 7.5, "Как приручить дракона");
        Student aspirant2 = new Aspirant("Хагрид", "Великий", "МЭ32", 4.9, "Как вырастить большого паука");
//        System.out.println("Студент " + student1.lastName + " " + student1.firstName + " в этом триместре получает стипендию: " + student1.getScholarship());
//        System.out.println("Аспирант " + aspirant1.lastName + " " + aspirant1.firstName + " в этом триместре получает стипендию: " + aspirant1.getScholarship());
//        System.out.println("Аспирант " + aspirant2.lastName + " " + aspirant2.firstName + " в этом триместре получает стипендию: " + aspirant2.getScholarship());
        Student[] studentsArr = {student1, aspirant1, aspirant2};
        for (Student s : studentsArr){
            String student = s instanceof Aspirant ? "Аспирант " : "Студент ";
            String st = "Студент ";
            System.out.println(student + s.lastName + " " + s.firstName + " в этом триместре получает стипендию: " + s.getScholarship());
        }
    }
}
