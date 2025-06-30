package sj_27_06;

public class try_catch {

	public static void main(String[] args) {
		int a=2;
		try {
			a=a/0;
		} catch (Exception e) {
			System.out.println("Errore");
		}
		
	}
}
