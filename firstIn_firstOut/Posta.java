package sj_30_06;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {
	private Queue<Persona> coda = new LinkedList<>(); 

	public void entraInCoda(Persona p) {
        coda.add(p);
        System.out.println("\n"+ p.getNome() + " è entrato/a in coda.");
    }
	
	public Object chiProssimo(){
		if (coda.isEmpty()) {
            System.out.println("La coda è vuota, non c'è nessuno in attesa");
            return null;
        } else {
            Persona prossimo = coda.peek();
            System.out.println("\nIl prossimo in coda è: " + prossimo.getNome());
            return prossimo;
        }
	}
	
	 public Persona servireProssimo() {
	        if (coda.isEmpty()) {
	            System.out.println("La coda è vuota, non c'è nessuno da servire");
	            return null;
	        } else {
	            Persona servito = coda.poll();
	            System.out.println(servito.getNome() + " è stato/a servito/a");
	            return servito;
	        }
	    }
	 
    public void mostraCoda() {
        if (coda.isEmpty()) {
            System.out.println("La coda è attualmente vuota");
            return;
        }

        System.out.println("\nPersone in coda:");
        for (Persona p : coda) {
            System.out.println(p.getNome());
        }
    }
	
}
