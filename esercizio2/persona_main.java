package test.esercizio2;

public class persona_main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Marco", "Bianchi", "S12345");
        Professore professore1 = new Professore("Mario", "Neri", "Matematica");
        Persona persona1 = new Persona("Giulio", "Russo");

        Persona[] persone = new Persona[3];
        persone[0] = studente1;
        persone[1] = professore1;
        persone[2] = persona1;

        for (Persona p : persone) {
            p.presentati();
        }
    }
}