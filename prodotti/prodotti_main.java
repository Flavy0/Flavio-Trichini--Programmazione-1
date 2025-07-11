package steve_jobs;

import java.time.LocalDate;
import java.util.ArrayList;

public class prodotti_main {
    public static void main(String[] args) {
        ArrayList<Prodotto> prodotti = new ArrayList<>();
        
        prodotti.add(new Prodotto("Yogurt", "Muller", 1.20, LocalDate.of(2025, 6, 10)));
        prodotti.add(new Prodotto("Pane", "Mulino Bianco", 2.00, LocalDate.of(2025, 6, 5)));
        prodotti.add(new Prodotto("Latte", "Parmalat", 1.50, LocalDate.of(2025, 6, 15)));
        prodotti.add(1, new Prodotto("Biscotti", "Oreo", 2.50, LocalDate.of(2025, 7, 1)));

        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
            if (prodotto.isExpired()) {
                System.out.println("> Prodotto SCADUTO");
            } else {
                System.out.println("> Prodotto ancora valido");
            }
        }
    }
}  