package ua.opnu;

public class Student {
    private String name;
    private int year;
    private String[] courses;
    private int coursesAmount;

    public Student(String name, int year) {
        if (year > 4 || year < 1) {
            throw new IllegalArgumentException("Year must be between 1 and 4");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }
        this.name = name;
        this.year = year;
        this.courses = new String[10];
        this.coursesAmount = 0;
    }

    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()){
            if (coursesAmount < courses.length){
                courses[coursesAmount] = courseName;
                coursesAmount++;
            } else {
                System.out.println("It is not possible to add more disciplines.");
            }
        }
    }

    public void dropAll() {
        for (int i = 0; i < courses.length; i++) {
            courses[i] = null;
        }
        coursesAmount = 0;
    }

    public int getCoursesCount() {
        return coursesAmount;
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * 20000;
    }

    public int getYear() {
        return year;
    }
}
