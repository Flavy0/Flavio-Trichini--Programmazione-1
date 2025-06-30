package sj_30_06;


public class posta_main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Mario");
        Persona p2 = new Persona("Luisa");
        Persona p3 = new Persona("Giuseppe");
        Posta ufficioPostale = new Posta();

        ufficioPostale.entraInCoda(p1);
        ufficioPostale.entraInCoda(p2);
        ufficioPostale.entraInCoda(p3);
        ufficioPostale.mostraCoda();
        ufficioPostale.chiProssimo();
        ufficioPostale.servireProssimo();
        ufficioPostale.servireProssimo();
        ufficioPostale.mostraCoda();
	}

}
