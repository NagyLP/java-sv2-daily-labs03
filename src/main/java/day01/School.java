package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(100);
        System.out.println(students);
        System.out.println(students.toString());
        System.out.println();
    }
}
