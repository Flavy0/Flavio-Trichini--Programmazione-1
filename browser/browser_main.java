package sj_30_06;

public class browser_main {
    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.visitPage("home.html");
        browser.visitPage("prodotti.html");
        browser.visitPage("dettaglio-prodotto.html");

        browser.printHistory();

        browser.goBack();
        browser.goBack();

        browser.printHistory();

        browser.goBack();
        browser.goBack();
        browser.printHistory();
    }
}