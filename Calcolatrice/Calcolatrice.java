package steve_jobs_20_06;

public class Calcolatrice {
	private double n1;
	private double n2;

	public Calcolatrice(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public String concatenamento() {
		String n1s = String.valueOf(n1);
		String n2s = String.valueOf(n2);
		return n1s + "+" + n2s;
	}

	public int somma() {
		return (int) (n1 + n2);
	}

	public int sommaTreNumeriInteri(int a, int b, int c) {
		return a + b + c;
	}

	public double sommaDueNumeriDecimali(double x, double y) {
		return x + y;
	}
}