package collections.maps.students;

import java.util.*;

public class Catalog {
    Map<Student, Map<Course, List<Grade>>> gradesBook;

    public Catalog(Map<Student, Map<Course, List<Grade>>> gradesBook) {
        this.gradesBook = gradesBook;
    }

    public Catalog() {
        this.gradesBook = new HashMap<>();
    }


    public Catalog addGrade(Student student, Grade grade) {
        if (gradesBook.get(student) == null) {
            gradesBook.put(student, new HashMap<>() {{
                put(grade.getCourse(), new ArrayList<>());
            }});
        }
        if (gradesBook.get(student).get(grade.getCourse()) == null) {
            gradesBook.get(student).put(grade.getCourse(), new ArrayList<>());
        }
        gradesBook.get(student).get(grade.getCourse()).add(grade);

            //////ALTERNATIVE//////
//        gradesBook.computeIfAbsent(student, x->new HashMap<>(){{
//            put(grade.getCourse(), new ArrayList<>());
//        }}).computeIfAbsent(grade.getCourse(), x-> new ArrayList<>()).add(grade);
        return this;
    }
//
//    public void printGrades(Student student) {
//        System.out.println("\n" + student);
//        Map<Course, List<Grade>> courseGrades = gradesBook.get(student);
//        for (Course course : courseGrades.keySet()) {
//            List<Grade> grades = courseGrades.get(course);
//            System.out.println(course);
//            for (int i = 0; i < grades.size(); i++) {
//                System.out.print(grades.get(i).getValue() + " ");
//            }
//            System.out.println();
//        }
//    }



    public void printGrades(Student student) {
        System.out.println("\n" + student);
        Map <Course, List<Grade>> courseGrades = gradesBook.get(student);
        courseGrades.keySet().stream()
                .peek(System.out::println)
                .map(courseGrades::get)
                .flatMap(Collection::stream)
                .forEach(grade -> System.out.println(grade.getValue()));
    }

    public void printAverage(Student student) {
        try {
            System.out.println("\n" + student);
            Map<Course, List<Grade>> courseGrades = gradesBook.get(student);
            for (Course course : courseGrades.keySet()) {
                List<Grade> grades = courseGrades.get(course);
                System.out.println(course);
                double sum = 0;
                for (int i = 0; i < grades.size(); i++) {
//                System.out.print(grades.get(i).getValue() + " ");   //cu asta printezi fiecare nota
                    sum += grades.get(i).getValue();
                }
                System.out.println("Average is " + (sum / grades.size()));
            }
        } catch(RuntimeException e){
            throw new StudentNotFoundException("Student is not found " + student);
        }
    }

}
