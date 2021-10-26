package day02;

public class Mathematics {

    private int number;

    public boolean isPrime(int number) {
       boolean compare = Math.sqrt(number) <= 2;
       return compare;
      }
}
