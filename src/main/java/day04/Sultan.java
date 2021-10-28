package day04;

public class Sultan {

    public static void main(String[] args) {
        Prison prisonTest = new Prison();

        prisonTest.openFreeCells();

        for(int i=0; i<prisonTest.getCells().length; i++) {
            if (prisonTest.getCells()[i]==0) {
            System.out.println(i);
                }
        }
    }
}
