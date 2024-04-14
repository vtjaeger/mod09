import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");

        int num = scanner.nextInt();

        // Integer numWrapper = num;
        Integer numWrapper = Integer.valueOf(num);

        System.out.println("\nem wrapper: " +  numWrapper);
    }
}