package GUI_autobus;

public class Autista extends UtenteAutobus {
    private String patente;
    private int anniEsperienza;

    public Autista(String nome, String cognome, String codiceFiscale, String patente, int anniEsperienza) {
        super(nome, cognome, codiceFiscale);
        this.patente = patente;
        this.anniEsperienza = anniEsperienza;
    }

    @Override
    public String getTipo() {
        return "Autista";
    }

    public String getPatente() {
        return patente;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }
}