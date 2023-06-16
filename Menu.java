import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    private PiattoSpeciale piattoSpeciale;

    public Menu() {
        piattoSpeciale = new PiattoSpeciale();
    }

    private void inizializzaPiattoSpeciale() {
        piattoSpeciale.ingredientiPubblici.add("Rosetta");
        piattoSpeciale.ingredientiPubblici.add("Panino di sesamo");
        piattoSpeciale.prezziPubblici.add(2.0);
        piattoSpeciale.prezziPubblici.add(3.0);
        piattoSpeciale.inizializzaIngredientePrivato("Carne", 2.0);
        piattoSpeciale.inizializzaIngredientePrivato("Porchetta", 3.5);
    }

    public void effettuaOrdine() {
        int sceltaMenu = 0;
        int sceltaIngrediente = 0;
        ArrayList<String> ingredientiScelti = new ArrayList<>();
        double prezzoPanino = 1;
        inizializzaPiattoSpeciale();
        boolean boolOrdine = false;

        do {
            System.out.println("Menu");
            System.out.println("1. Effettua un ordine");
            System.out.println("2. Esci");
            System.out.print("Seleziona un'opzione: ");
            sceltaMenu = scanner.nextInt();

            switch (sceltaMenu) {
                case 1:
                    System.out.println("Hai selezionato di effettuare l'ordine!");
                    System.out.println("Scegli il tipo di panino:");
                    int count = 0;
                    int countCarne = 0;
                    for (String ingrediente : piattoSpeciale.ingredientiPubblici) {
                        System.out.println(count + ": " + ingrediente + " costo: "
                                + piattoSpeciale.prezziPubblici.get(count));
                        count++;
                    }
                    sceltaIngrediente = scanner.nextInt();
                    ingredientiScelti.add(piattoSpeciale.ingredientiPubblici.get(sceltaIngrediente));
                    prezzoPanino += piattoSpeciale.prezziPubblici.get(sceltaIngrediente);
                    System.out.println("Prezzo attuale: " + prezzoPanino);

                    System.out.println("Scrivi il tipo di carne scelto:");
                    for (String carne : piattoSpeciale.getIngredientiPrivati()) {
                        System.out.println(countCarne + ": " + carne);
                        countCarne++;
                    }
                    Scanner scannerCarne = new Scanner(System.in);
                    String sceltaCarne = scannerCarne.nextLine();
                    int indexCarneScelta = piattoSpeciale.getIngredientiPrivati().indexOf(sceltaCarne);
                    double prezzoCarne = piattoSpeciale.aggiungiIngredientePrivato(sceltaCarne, prezzoPanino,
                            indexCarneScelta);
                    prezzoPanino += prezzoCarne;
                    System.out.println("COMPOSIZIONE PANINO:");
                    for (int i = 0; i < ingredientiScelti.size(); i++) {
                        System.out.println(ingredientiScelti.get(i));
                    }
                    System.out.println("Il prezzo del panino è di " + prezzoPanino);
                    System.out.println("Aggiungere un nuovo panino allo stesso ordine?");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    int nuovoOrdine = scanner.nextInt();
                    if (nuovoOrdine == 1) {
                        boolOrdine = true;
                        break;
                    } else if (nuovoOrdine == 2) {
                        prezzoPanino = 1;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Grazie per aver usato la nostra app!");
                    return;

                default:
                    System.out.println("Non hai inserito una scelta giusta");
                    break;
            }
        } while (sceltaMenu != 2);

    }

}
