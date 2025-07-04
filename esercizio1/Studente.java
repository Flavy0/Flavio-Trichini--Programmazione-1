package test;

public class Studente {
    String nome;
    String cognome;
    int nascita;

    public Studente(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = annoNascita;
    }

    public void stampaScheda() {
        System.out.println(nome + " " + cognome + ", nato nel " + nascita);
    }
}
