import java.util.Scanner;

public class HealthCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user questions
        System.out.println("Are you hungry? (true/false)");
        boolean hungry = sc.nextBoolean();

        System.out.println("Are you tired? (true/false)");
        boolean tired = sc.nextBoolean();

        System.out.println("Are you hydrated? (true/false)");
        boolean hydrated = sc.nextBoolean();

        System.out.println("\n--- Health Suggestions ---");

        if (hungry && !tired) {
            System.out.println("You should eat something 🍲");
        }

        if (tired && !hungry) {
            System.out.println("Take a nap 💤");
        }

        if (!hydrated) {
            System.out.println("Drink some water 💧");
        }

        if (!hungry && !tired && hydrated) {
            System.out.println("You're doing great! 😄 Keep it up!");
        }

        sc.close();
    }
}
