package steve_jobs;

public class forma_main {
    public static void main(String[] args) {
        Triangolo mioTriangolo = new Triangolo(2, 4, 4);
        Cerchio mioCerchio = new Cerchio(7);
        Rettangolo mioRettangolo = new Rettangolo(8, 6);

        Forma[] forme = new Forma[3];
        forme[0] = mioTriangolo;
        forme[1] = mioCerchio;
        forme[2] = mioRettangolo;

        for (Forma f : forme) {
            f.stampaDettagli();
            System.out.println();
        }
    }
}