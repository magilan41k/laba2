import java.math.BigInteger;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println((Math.pow(x, 2) - (7 * x) + 10)/(Math.pow(x, 2) - (8 * x) + 12));
    }
}