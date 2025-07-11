package steve_jobs_20_06;

public class veicolo_main {
    public static void main(String[] args) {
        AutoIbrida laMiaAuto = new AutoIbrida(75);
        System.out.println(laMiaAuto);

        laMiaAuto.ricarica();
        System.out.println(laMiaAuto);

        laMiaAuto.connetti();
        System.out.println(laMiaAuto);

        laMiaAuto.disconnetti();
        System.out.println(laMiaAuto);

        laMiaAuto.disconnetti(); 
    }
}