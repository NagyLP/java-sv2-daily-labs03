package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> studentName = new ArrayList<>();

    public boolean addStudent (String studentName) {
        if (studentName.contains(" ")) { return true;
    } else {
            return false;
        }}
}
