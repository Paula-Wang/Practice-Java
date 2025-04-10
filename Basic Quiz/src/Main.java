import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎓Welcome to the Java Quiz! ");
        System.out.println("Question 1: What does JVM stand for?");
        System.out.println("A) Java Variable Machine");
        System.out.println("B) Java Virtual Machine");
        System.out.println("C) Just Very Modern");
        System.out.println("Your answer:");

        String answer = sc.nextLine();

        if (answer.equals("B")) {
            System.out.println("✅ Correct!");
        } else {
            System.out.println("❌ Incorrect! The correct answer is B) Java Virtual Machine.");
        }
        sc.close();

    }
}