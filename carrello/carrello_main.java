package steve_jobs_20_06;


public class carrello_main {
    public static void main(String[] args) {
        Carrello mioCarrello = new Carrello();

        mioCarrello.aggiungiProdotto("Mela", 3);
        mioCarrello.aggiungiProdotto("Pane", 1);
        mioCarrello.aggiungiProdotto("Latte", 2);
        mioCarrello.getProdotti();
    }
}