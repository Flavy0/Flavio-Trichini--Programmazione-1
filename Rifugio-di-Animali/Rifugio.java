package steve_jobs;

import java.util.ArrayList;
import java.util.List;

public class Rifugio {
	private List<Animale> animali;
	
	public Rifugio() {
        this.animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale a) {
        this.animali.add(a);
        System.out.println("> Animale aggiunto al rifugio.");
    }

    public void stampaVersi() {
        if (this.animali.isEmpty()) {
            System.out.println("Il rifugio non ha animali al momento.");
            return;
        }
        
        System.out.println("--- Versi degli animali nel rifugio ---");
        for (Animale a : animali) {
            a.emettiVerso();
        }
        
        System.out.println("------------------------------------");
    }
}