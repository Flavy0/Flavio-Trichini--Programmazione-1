package steve_jobs;

import java.time.LocalDate;

class Prodotto {
    String nome;
    String marca;
    double prezzo;
    LocalDate scadenza;

    public Prodotto(String nome, String marca, double prezzo, LocalDate scadenza) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }

    public boolean isExpired() {
    	if (LocalDate.now().isAfter(scadenza) || LocalDate.now().isEqual(scadenza)) {
    		return true;
    	}
		return false;
    }

    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                "€, scadenza=" + scadenza +
                '}';
    }
}