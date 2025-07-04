package test.esercizio3;


public class Utente{
	String username;
	String email;
	
	public Utente(String username, String email) {
	    this.username = username;
	    this.email = email;
	}
	
	public void presentati() {
	    System.out.println("Utente generico: " + username + ", email: " + email);
	}
}
	
class Studente extends Utente implements Autenticabile {
	String matricola;
	
	public Studente(String username, String email, String matricola) {
	    super(username, email);
	    this.matricola = matricola;
	}
	
	@Override
	public void autentica(String password) throws AutenticazioneException {
	    if (!password.equals("studente123")) {
	    throw new AutenticazioneException("Password errata per lo studente " + username);
	}
	    else
	    	System.out.println("Autenticazione riuscita per lo studente " + username);
	}
	
	@Override
	public void presentati() {
	    System.out.println("Studente " + username + ", matricola: " + matricola);
	}
}

class Professore extends Utente implements Autenticabile {
	String materia;

	public Professore(String username, String email, String materia) {
	     super(username, email);
	     this.materia = materia;
	}
	
	 @Override
	public void autentica(String password) throws AutenticazioneException {
	    if (!password.equals("prof2024")) {
	    	throw new AutenticazioneException("Password errata per il professore " + username);
		}
	    else
	    	System.out.println("Autenticazione riuscita per il professore " + username);
	}
	
 @Override
	public void presentati() {
	    System.out.println("Professore " + username + ", insegna: " + materia);
	}
}

class Segreteria extends Utente {
	String ufficio;
	
	public Segreteria(String username, String email, String ufficio) {
	    super(username, email);
	    this.ufficio = ufficio;
	}
	
	@Override
	public void presentati() {
	    System.out.println("Personale di segreteria " + username + ", ufficio: " + ufficio);
	}
}