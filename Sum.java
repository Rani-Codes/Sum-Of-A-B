import java.util.Scanner;

public class Sum  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in two numbers, they can be decimals: ");
        double A = input.nextDouble(); // initializing variable and waiting for input
        double B = input.nextDouble(); // initializing second variable and waiting for input

        double sum = A + B;

        System.out.println("You chose " + A + " and " + B + " to be your numbers. The sum of the two numbers is: " + sum);
    }
}