package steve_jobs;

public class animale_main {
	public static void main(String[] args) {
        Rifugio rifugio = new Rifugio();

        cane inu = new cane();
        gatto damiano = new gatto();

        rifugio.aggiungiAnimale(inu);
        rifugio.aggiungiAnimale(damiano);

        rifugio.stampaVersi();

        cane pochita = new cane();
        rifugio.aggiungiAnimale(pochita);
        rifugio.stampaVersi();
    }
}
