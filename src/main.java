import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double miles = 0;
        double meters = 0;
        double inches = 0;
        double feet = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your measurement in meters: ");
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
        } else {
            System.out.println("You entered an invalid input");

        }
        miles = (meters/1609.334);
        feet = (meters * 3.281);
        inches = ((meters * 3.281) * 12);

        System.out.println("Your measurement in miles is: "+ miles);
        System.out.println("Your measurement in feet is: "+ feet);
        System.out.println("Your measurement in inches is: "+ inches);
    }
}
