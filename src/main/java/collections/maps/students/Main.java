package collections.maps.students;

public class Main {

    public static void main(String[] args) {
        Student george = new Student("George", "Coconel", "19674324235");
        Student marcel = new Student("Marcel", "Marius", "195676545");
        Student bula = new Student("Bula", "Bulescu", "196543332");

        Catalog studentGrades = new Catalog();
        studentGrades.addGrade(george, new Grade(10, Course.MATHEMATICS));
        studentGrades.addGrade(george, new Grade(7, Course.PHYSICS));
        studentGrades.addGrade(george, new Grade(7, Course.MATHEMATICS));
        studentGrades.addGrade(george, new Grade(9, Course.COMPUTER_SCIENCE));

        studentGrades.addGrade(marcel, new Grade(9, Course.MATHEMATICS));
        studentGrades.addGrade(marcel, new Grade(10, Course.PHYSICS));
        studentGrades.addGrade(marcel, new Grade(10, Course.COMPUTER_SCIENCE));
        studentGrades.addGrade(marcel, new Grade(9, Course.COMPUTER_SCIENCE));

        studentGrades.printGrades(george);
        studentGrades.printGrades(marcel);

        System.out.println("----------------");
        studentGrades.printAverage(george);
        studentGrades.printAverage(marcel);

        System.out.println("----------------");
        try {
            studentGrades.printAverage(bula);
        } catch(StudentNotFoundException e){
            System.out.println("Student not found in our class!");
        }








    }
}
