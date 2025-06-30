package sj_30_06;

import java.util.Stack;

public class Browser {
    private Stack<String> history;

    public Browser() {
        this.history = new Stack<>();
        System.out.println("Browser avviato. Cronologia vuota");
    }

    public void visitPage(String url) {
        history.push(url);
        System.out.println("Visitata: " + url);
    }

    public String goBack() {
        if (history.isEmpty() || history.size() == 1) {
            System.out.println("Nessuna pagina precedente");
            return null;
        } else {
            String currentPage = history.pop();
            String previousPage = history.peek();
            System.out.println("Tornato a: " + previousPage + " (era su " + currentPage + ")");
            return previousPage;
        }
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("La cronologia è vuota");
            return;
        }
        System.out.println("\nCronologia di navigazione (dal più recente al meno recente)");
        Stack<String> tempHistory = new Stack<>();
        tempHistory.addAll(history);

        while (!tempHistory.isEmpty()) {
            System.out.println("- " + tempHistory.pop());
        }
    }
}