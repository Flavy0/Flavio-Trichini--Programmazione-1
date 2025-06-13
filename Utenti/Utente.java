package steve_jobs;

import java.util.ArrayList;
import java.util.List;

public abstract class Utente {
    private String username;
    private String email;

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public abstract List<String> getPermessi();

    public void stampaInfo() {
        System.out.println("Username: " + this.username + " - Email: " + this.email);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

class Admin extends Utente {

    public Admin(String username, String email) {
        super(username, email);
    }

    @Override
    public List<String> getPermessi() {
        List<String> permessi = new ArrayList<>();
        permessi.add("READ");
        permessi.add("WRITE");
        permessi.add("DELETE");
        return permessi;
    }
}

class Cliente extends Utente {

    public Cliente(String username, String email) {
        super(username, email);
    }

    @Override
    public List<String> getPermessi() {
        List<String> permessi = new ArrayList<>();
        permessi.add("READ");
        return permessi;
    }
}

class GestioneUtenti {
    private List<Utente> utenti;

    public GestioneUtenti() {
        this.utenti = new ArrayList<>();
    }

    public void aggiungiUtente(Utente u) {
        this.utenti.add(u);
        System.out.println("Utente '" + u.getUsername() + "' aggiunto al sistema.");
    }

    public void stampaPermessi() {
        if (this.utenti.isEmpty()) {
            System.out.println("Nessun utente registrato nel sistema.");
            return;
        }
        System.out.println("\n--- Permessi Utenti ---");
        for (Utente u : utenti) {
            u.stampaInfo();
            System.out.println("Permessi: " + u.getPermessi());
            System.out.println("------------------------");
        }
    }
}
