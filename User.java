import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public ArrayList<String> username;
    public ArrayList<String> password;

    public void registration() {
        User newUser = new User();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un nuovo username");
        String username = scanner.nextLine();
        System.out.println("Inserisci una password");
        String password = scanner.nextLine();
        newUser.username.add(username);
        newUser.password.add(password);
    }

    public void verify() {
        Scanner scanner = new Scanner(System.in);
        User userRegistred = new User();

        System.out.println("Inserisci il tuo username");
        String username = scanner.nextLine();
        System.out.println("Inserisci la tua password");
        String password = scanner.nextLine();

        for (String usernames : userRegistred.username) {
            for (String passwString : userRegistred.password) {
                if (username.equals(userRegistred) && password.equals(userRegistred)) {
                    System.out.println("ACCESSO CONSENTITO");

                } else {
                    System.out.println("ACCESSO NEGATO");
                    return;
                }
            }
        }
    }
}
