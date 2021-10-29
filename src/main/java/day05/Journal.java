package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> studentName = new ArrayList<>();

    public boolean addStudent (String studentName) {
        if (studentName.trim().indexOf(' ')>0) { this.studentName.add(studentName);
            return true;
    } else {
            return false;
        }}

    public List<String> getStudentName() {
        return studentName;
    }
}
