package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Мансур", 2);

        student.addCourse("ООП");
        student.addCourse("ОБДЗ");
        student.addCourse("Теорія алгоритмів");
        student.addCourse("Теорія ймовірності");
        student.addCourse("Інструментальні засоби систем ІоТ");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCoursesCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}