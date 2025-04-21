import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLEASE PICK A NUMBER BETWEEN 1-10:");
        int input = scanner.nextInt();

        String[] quotes = {
                "1: Innovation distinguishes between a leader and a follower.",
                "2: Do not follow where the path may lead. Go instead where there is no path and leave a trail.",
                "3: You gain strength, courage and confidence by every experience in which you really stop to look fear in the face. You must do the thing you think you cannot do.",
                "4: In matters of style, swim with the current; in matters of principle, stand like a rock.",
                "5: Never doubt that a small group of thoughtful, concerned citizens can change the world. Indeed it is the only thing that ever has.",
                "6: Fear is only an illusion.",
                "7: We will always make mistakes why do you think there is an eraser on a pencil.",
                "8: Money makes the world go around but your purpose is what makes you go around.",
                "9: If you fall down get back up — what else is the other option?",
                "10: Time is only of the essence."
        };

        // Validate input
        if (input >= 1 && input <= 10) {
            System.out.println(quotes[input - 1]); // Subtract 1 because arrays start at 0
        } else {
            System.out.println("Invalid choice. Please pick a number between 1 and 10.");
        }
    }
}