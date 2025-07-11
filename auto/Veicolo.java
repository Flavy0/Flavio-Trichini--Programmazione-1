package steve_jobs_20_06;


public abstract class Veicolo implements Ricaricabile, Connettivita {
    private int batteria;
    private boolean connesso;

    public Veicolo(int batteria) {
        this.batteria = batteria;
        connesso = false;
    }

    public int getBatteria() {
        return batteria;
    }

    public void setBatteria(int batteria) {
        this.batteria = batteria;
    }

    @Override
    public void ricarica() {
        System.out.println("Il veicolo si sta ricaricando...");
        batteria = 100;
        System.out.println("Batteria ricaricata al " + this.batteria + "%.");
    }

    @Override
    public void connetti() {
        if (!connesso) {
            System.out.println("Il veicolo si sta connettendo...");
           connesso = true;
            System.out.println("Veicolo connesso.");
        } else {
            System.out.println("Il veicolo è già connesso.");
        }
    }

    @Override
    public void disconnetti() {
        if (connesso) {
            System.out.println("Il veicolo si sta disconnettendo...");
            connesso = false;
            System.out.println("Veicolo disconnesso.");
        } else {
            System.out.println("Il veicolo non è attualmente connesso.");
        }
    }

    @Override
    public boolean isConnesso() {
        return this.connesso;
    }

    @Override
    public String toString() {
        return "Veicolo [Batteria=" + batteria + "%, Connesso=" + connesso + "]";
    }
}

