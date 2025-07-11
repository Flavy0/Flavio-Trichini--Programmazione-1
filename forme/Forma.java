package steve_jobs;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract float calcolaArea();
    public abstract float calcolaPerimetro();

    public void stampaDettagli() {
        System.out.println("Figura: " + nome);
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }
}

class Triangolo extends Forma {
    private float lato1;
    private float lato2;
    private float lato3;

    public Triangolo(float lato1, float lato2, float lato3) {
        super("Triangolo");
        if (lato1 + lato2 <= lato3 || lato1 + lato3 <= lato2 || lato2 + lato3 <= lato1) {
            System.out.println("I lati forniti non possono formare un triangolo valido.");
            return;
        }
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public float calcolaArea() {
        float semiperimetro = (lato1 + lato2 + lato3) / 2;
        return (float) Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
    }

    @Override
    public float calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}

class Cerchio extends Forma {
    private float raggio;

    public Cerchio(float raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public float calcolaArea() {
        return (float) (Math.PI * raggio * raggio);
    }

    @Override
    public float calcolaPerimetro() {
        return (float) (2 * Math.PI * raggio);
    }
}

class Rettangolo extends Forma {
    private float lunghezza;
    private float larghezza;

    public Rettangolo(float lunghezza, float larghezza) {
        super("Rettangolo");
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public float calcolaArea() {
        return lunghezza * larghezza;
    }

    @Override
    public float calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }
}
