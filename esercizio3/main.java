package test.esercizio3;

import java.util.ArrayList;

public class main {
	 public static void main(String[] args) {
	     ArrayList<Utente> utenti = new ArrayList<>();
	     utenti.add(new Studente("damiano.pappalardo", "damiano.pappalardo@example.com", "S001"));
	     utenti.add(new Professore("renzo.bianchi", "renzo.bianchi@example.com", "Matematica"));

	     for (Utente utente : utenti) {
	         utente.presentati();
	         
             Autenticabile autenticabileUser = (Autenticabile) utente;
             try {
            	 if (utente.getClass() == Studente.class) {		// getClass è un metodo che ho ottenuto dalla documentazione per verificare
        		    											// il tipo esatto dell'oggetto figlio, in modo da distinguere studente e professore.            		 											
            		 autenticabileUser.autentica("studente123");
                 }
            	 if (utente.getClass() == Professore.class) {
                     autenticabileUser.autentica("aaaa");		//l'eccezione verrà generata
            	 }
             } catch (AutenticazioneException e) {
                 System.out.println("Errore di autenticazione: " + e.getMessage());
             }
	         
	         System.out.println("");
	     }
	 }
}