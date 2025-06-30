package sj_30_06;

import java.util.Stack;

public class Browser {
    private Stack<String> history;

    public Browser() {
        history = new Stack<>();
        System.out.println("Browser avviato. Cronologia vuota");
    }

    public void visitPage(String url) {
        history.push(url);
        System.out.println("Visitata: " + url);
    }

    public String goBack() {
        try {
            String currentPage = history.pop();
            String previousPage = history.peek();
            System.out.println("Tornato/a a: " + previousPage + " (era su " + currentPage + ")");
            return previousPage;
        } catch (Exception e) {
            System.out.println("Nessuna pagina precedente.");
            return null;
        }
    }

    public void printHistory() {
        Stack<String> tempStack = new Stack<>();
        tempStack.addAll(history);

        try {
            System.out.println("\n- Cronologia di navigazione (dal più recente al meno recente)");
            while (!tempStack.isEmpty()) {
                System.out.println("- " + tempStack.pop());
            }
        } catch (Exception e) {
            System.out.println("La cronologia è vuota.");
        }
    }
}
