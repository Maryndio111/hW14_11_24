import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите емаил: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
            System.out.println("Емаил корректный: "+ email);
        } catch (NotCorrectEmailFormatException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    }
        // Метод для проверки корректности email
        public static void checkEmail(String email) throws NotCorrectEmailFormatException {
            if (email.length() < 5) {
                throw new NotCorrectEmailFormatException("Email должен содержать не менее 5 символов.");
            }
            if (!email.contains("@")) {
                throw new NotCorrectEmailFormatException("Email должен содержать символ '@'.");
            }
            if (email.startsWith("@") || email.endsWith("@")) {
                throw new NotCorrectEmailFormatException("Символ '@' не должен быть первым или последним.");
            }
        }
}

