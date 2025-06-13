package steve_jobs;

public abstract class Animale {
	public abstract void emettiVerso();
    public abstract void descrizione();
}

class cane extends Animale {

	@Override
	public void emettiVerso() {
		System.out.println("Bau!");
	}

	@Override
	public void descrizione() {
		System.out.println("Sono un cane!");
	}

}

class gatto extends Animale {

	@Override
	public void emettiVerso() {
		System.out.println("Meow!");
	}

	@Override
	public void descrizione() {
		System.out.println("Sono un gatto!");
	}

}

