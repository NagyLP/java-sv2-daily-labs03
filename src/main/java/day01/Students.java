package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public List<Integer> Height = new ArrayList<>();

    public void addHeight(int height) {
        Height.add(height);
        }

    public boolean isHeightisIncreasing() {
        for (int i = 1; i< Height.size(); i++) {
            if (Height.get(i) < Height.get(i-1)) { return false; }
        }
         return true;
    }
}
