import java.util.ArrayList;

public class PiattoSpeciale {

    private ArrayList<String> ingredientiPrivati;
    private ArrayList<Double> prezziIngredientiPrivati;
    public ArrayList<String> ingredientiPubblici;
    public ArrayList<Double> prezziPubblici;
    private double prezzoBase;

    public PiattoSpeciale() {
        ingredientiPrivati = new ArrayList<>();
        ingredientiPubblici = new ArrayList<>();
        prezziPubblici = new ArrayList<>();
        prezziIngredientiPrivati = new ArrayList<>();
        prezzoBase = 1.0;
    }

    public ArrayList<String> getIngredientiPrivati() {
        return this.ingredientiPrivati;
    }

    public void setIngredientiPrivati(ArrayList<String> ingredientiPrivati) {
        this.ingredientiPrivati = ingredientiPrivati;
    }

    public ArrayList<Double> getPrezziIngredientiPrivati() {
        return this.prezziIngredientiPrivati;
    }

    public void setPrezziIngredientiPrivati(ArrayList<Double> prezziIngredientiPrivati) {
        this.prezziIngredientiPrivati = prezziIngredientiPrivati;
    }

    public double getPrezzoBase() {
        return this.prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public double aggiungiIngredientePrivato(String ingrediente, double prezzo, int index) {
        return prezziIngredientiPrivati.get(index);
    }

    public void inizializzaIngredientePrivato(String ingrediente, double prezzo) {
        ingredientiPrivati.add(ingrediente);
        prezziIngredientiPrivati.add(prezzo);
    }
}
