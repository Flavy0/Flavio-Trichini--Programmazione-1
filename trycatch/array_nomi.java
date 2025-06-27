package sj_27_06;

import java.util.Scanner;

public class array_nomi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero:");
        String ns = scanner.nextLine();
        scanner.close();
        int n = Integer.valueOf(ns);
        String[] nomi= {"giulio", "ugo", "anna", "gabriele", "fernando"};
        try {
        	System.out.println(nomi[n]);
        } catch (Exception e) {
        	System.out.println("Errore");
        } finally {
        	ns.close();
        }
	}
}
