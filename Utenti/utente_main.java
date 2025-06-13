package steve_jobs;

public class utente_main {
	public static void main(String[] args) {
	    GestioneUtenti sistemaUtenti = new GestioneUtenti();
	
	    Admin admin1 = new Admin("admin.root", "gragas@gmail.com");
	    Admin admin2 = new Admin("super.admin", "lucas@gmail.com");
	
	    Cliente cliente1 = new Cliente("user.alpha", "nemo@gmail.com");
	    Cliente cliente2 = new Cliente("user.beta", "patapima@gmail.com");
	
	    sistemaUtenti.aggiungiUtente(admin1);
	    sistemaUtenti.aggiungiUtente(admin2);
	    sistemaUtenti.aggiungiUtente(cliente1);
	    sistemaUtenti.aggiungiUtente(cliente2);
	
	    sistemaUtenti.stampaPermessi();
	}
}