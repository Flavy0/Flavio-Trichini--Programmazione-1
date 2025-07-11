package GUI_autobus;

public abstract class UtenteAutobus {
    protected String nome;
    protected String cognome;
    protected String codiceFiscale;

    public UtenteAutobus(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public abstract String getTipo();
}