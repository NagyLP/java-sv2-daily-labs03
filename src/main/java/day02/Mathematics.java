package day02;

public class Mathematics {

    public boolean isPrime(int number) {
        boolean compare = false;
        if (number == 0) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                for (int j = number / i; j < number; j++) {
                compare = i <= j;}
            }
        return compare;
        }
    }
}
//        if (number == 0) {
//            return false;
//        } else {
//            return compare;
//        }
