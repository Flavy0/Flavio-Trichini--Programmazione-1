package steve_jobs_20_06;

public class calcolatrice_main {
    public static void main(String[] args) {
        Calcolatrice Calcolatrice = new Calcolatrice(10.5, 20.3);


        String numeriConcatenati = Calcolatrice.concatenamento();
        System.out.println("Concatenamento di numero1 e numero2: " + numeriConcatenati);

        int sommaIniziale = Calcolatrice.somma();
        System.out.println("Somma di numero1 e numero2 (come int): " + sommaIniziale);


        int sommaTreInteri = Calcolatrice.sommaTreNumeriInteri(5, 10, 15);
        System.out.println("Somma di tre numeri interi (5, 10, 15): " + sommaTreInteri);

        double sommaDueDecimali = Calcolatrice.sommaDueNumeriDecimali(7.7, 8.3);
        System.out.println("Somma di due numeri decimali (7.7, 8.3): " + sommaDueDecimali);
    }
}