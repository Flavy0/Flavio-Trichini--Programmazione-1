package GUI;

class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome;
    }
}

class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Studente - " + super.toString() + ", Matricola: " + matricola;
    }
}

class Professore extends Persona {
    private String dipartimento;

    public Professore(String nome, String cognome, String dipartimento) {
        super(nome, cognome);
        this.dipartimento = dipartimento;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    @Override
    public String toString() {
        return "Professore - " + super.toString() + ", Dipartimento: " + dipartimento;
    }
}
