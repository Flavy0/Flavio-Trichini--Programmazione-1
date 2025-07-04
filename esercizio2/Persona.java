package test.esercizio2;

class Persona {
    String nome;
    String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void presentati() {
        System.out.println("Ciao, sono " + nome + " " + cognome);
    }
}

class Studente extends Persona {
    String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Sono lo studente " + nome + " " + cognome + ", matricola: " + matricola);
    }
}

class Professore extends Persona {
    String materia;

    public Professore(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    @Override
    public void presentati() {
        System.out.println("Sono il prof. " + nome + " " + cognome + ", insegno " + materia);
    }
}