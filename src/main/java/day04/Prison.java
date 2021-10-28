package day04;

public class Prison {

    private int[] cells = new int[100];

    public int[] getCells() {
        return cells;
    }

    public void openFreeCells() {

        for (int i = 1; i < cells.length; i++) {
            for (int j = i; j <= cells.length; j += (i + 1)) {
                if (j + 1 % (i + 1) == 0) {
                    if (cells[i+1] == 1) {
                        cells[i+1] = 0;
                    } else {
                        cells[i+1] = 1;
                    }
                }
            }
        }
    }
}