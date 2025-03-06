import java.util.Scanner;

class ConverterApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
{
            System.out.println("Converter Application Menu:");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currencyConverter(scanner);
                    break;
                case 2:
                    distanceConverter(scanner);
                    break;
                case 3:
                    timeConverter(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void currencyConverter(Scanner scanner) {
        System.out.println("Currency Converter Menu:");
        System.out.println("1. Dollar to INR");
        System.out.println("2. Euro to INR");
        System.out.println("3. Yen to INR");
        System.out.println("4. INR to Dollar");
        System.out.println("5. INR to Euro");
        System.out.println("6. INR to Yen");
        System.out.print("Enter your choice: ");
        int currencyChoice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0;

        switch (currencyChoice) {
            case 1:
                convertedAmount = amount * 82.50; 
                System.out.println(amount + " Dollar = " + convertedAmount + " INR");
                break;
            case 2:
                convertedAmount = amount * 90.00;
                System.out.println(amount + " Euro = " + convertedAmount + " INR");
                break;
            case 3:
                convertedAmount = amount * 0.60; 
                System.out.println(amount + " Yen = " + convertedAmount + " INR");
                break;
            case 4:
                convertedAmount = amount / 82.50;
                System.out.println(amount + " INR = " + convertedAmount + " Dollar");
                break;
            case 5:
                convertedAmount = amount / 90.00;
                System.out.println(amount + " INR = " + convertedAmount + " Euro");
                break;
            case 6:
                convertedAmount = amount / 0.60;
                System.out.println(amount + " INR = " + convertedAmount + " Yen");
                break;
            default:
                System.out.println("Invalid currency choice!");
        }
    }

    public static void distanceConverter(Scanner scanner) {
        System.out.println("Distance Converter Menu:");
        System.out.println("1. Meter to Kilometer");
        System.out.println("2. Miles to Kilometer");
        System.out.println("3. Kilometer to Meter");
        System.out.println("4. Kilometer to Miles");
        System.out.print("Enter your choice: ");
        int distanceChoice = scanner.nextInt();

        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();
        double convertedDistance = 0;

        switch (distanceChoice) {
            case 1:
                convertedDistance = distance / 1000; 
                System.out.println(distance + " meters = " + convertedDistance + " kilometers");
                break;
            case 2:
                convertedDistance = distance * 1.60934; 
                System.out.println(distance + " miles = " + convertedDistance + " kilometers");
                break;
            case 3:
                convertedDistance = distance * 1000;
                System.out.println(distance + " kilometers = " + convertedDistance + " meters");
                break;
            case 4:
                convertedDistance = distance / 1.60934;
                System.out.println(distance + " kilometers = " + convertedDistance + " miles");
                break;
            default:
                System.out.println("Invalid distance choice!");
        }
    }

    public static void timeConverter(Scanner scanner) {
        System.out.println("Time Converter Menu:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Seconds");
        System.out.println("3. Seconds to Minutes");
        System.out.println("4. Minutes to Hours");
        System.out.print("Enter your choice: ");
        int timeChoice = scanner.nextInt();

        System.out.print("Enter time: ");
        double time = scanner.nextDouble();
        double convertedTime = 0;

        switch (timeChoice) {
            case 1:
                convertedTime = time * 60; 
                System.out.println(time + " hours = " + convertedTime + " minutes");
                break;
            case 2:
                convertedTime = time * 60; 
                System.out.println(time + " minutes = " + convertedTime + " seconds");
                break;
            case 3:
                convertedTime = time / 60;
                System.out.println(time + " seconds = " + convertedTime + " minutes");
                break;
            case 4:
                convertedTime = time / 60; 
                System.out.println(time + " minutes = " + convertedTime + " hours");
                break;
            default:
                System.out.println("Invalid time choice!");
        }
    }
}
