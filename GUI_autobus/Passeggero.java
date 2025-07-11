package GUI_autobus;

public class Passeggero extends UtenteAutobus {
    private String destinazione;
    private boolean haBagaglio;

    public Passeggero(String nome, String cognome, String codiceFiscale, String destinazione, boolean haBagaglio) {
        super(nome, cognome, codiceFiscale);
        this.destinazione = destinazione;
        this.haBagaglio = haBagaglio;
    }

    public String getTipo() {
        return "Passeggero";
    }

    public String getDestinazione() {
        return destinazione;
    }

    public boolean haBagaglio() {
        return haBagaglio;
    }
}