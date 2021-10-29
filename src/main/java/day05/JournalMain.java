package day05;

import java.util.Scanner;

public class JournalMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Journal journal = new Journal();

        System.out.println("Kérem a nevet: ");
        journal.addStudent(sc.nextLine());
        System.out.println(journal);

        System.out.println(journal.getStudentName().size());

    }

}
