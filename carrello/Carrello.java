package steve_jobs_20_06;

import java.util.ArrayList;

public class Carrello {
    private ArrayList<String> prodotti = new ArrayList<>();

    public void aggiungiProdotto(String nome, int quantita) {
        for (int i = 0; i < quantita; i++) {
            prodotti.add(nome);
        }
    }

    public void getProdotti() {
        String prodottoAttuale = prodotti.get(0);
        int conteggio = 0;

        System.out.println("Prodotti nel carrello:");

        for (String prodotto : prodotti) {
            if (prodotto.equals(prodottoAttuale)) {
                conteggio++;
            } else {
                System.out.println("- " + prodottoAttuale + ": " + conteggio);
                prodottoAttuale = prodotto;
                conteggio = 1;
            }
        }
        System.out.println("- " + prodottoAttuale + ": " + conteggio);
    }
}