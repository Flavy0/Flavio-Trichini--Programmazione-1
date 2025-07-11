package GUI_autobus;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;

import javax.swing.*;


public class BusBookingApp extends JFrame {

    private static final int MAX_PASSEGGERI = 20;
    private static final int MAX_AUTISTI = 2;

    private int passeggeriAttuali = 0;
    private int autistiAttuali = 0;

    private List<UtenteAutobus> utentiRegistrati; 

    private JLabel labelPasseggeriRimanenti;
    private JLabel labelAutistiRimanenti;
    private JTextArea textAreaLog;

    public BusBookingApp() {
        super("Sistema di Prenotazione Autobus");
        this.utentiRegistrati = new ArrayList<>();
        setupUI();
        updateLabels();
    }

    private void setupUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel panelMain = new JPanel(new BorderLayout(10, 10));
        panelMain.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panelCounters = new JPanel(new GridLayout(2, 2, 5, 5));
        panelCounters.setBorder(BorderFactory.createTitledBorder("Posti Disponibili"));

        panelCounters.add(new JLabel("Passeggeri Rimanenti:"));
        labelPasseggeriRimanenti = new JLabel();
        panelCounters.add(labelPasseggeriRimanenti);

        panelCounters.add(new JLabel("Autisti Rimanenti:"));
        labelAutistiRimanenti = new JLabel();
        panelCounters.add(labelAutistiRimanenti);

        panelMain.add(panelCounters, BorderLayout.NORTH);

        JPanel panelButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton btnAddPasseggero = new JButton("Aggiungi Passeggero");
        JButton btnAddAutista = new JButton("Aggiungi Autista");

        btnAddPasseggero.addActionListener(e -> addPasseggero());
        btnAddAutista.addActionListener(e -> addAutista());

        panelButtons.add(btnAddPasseggero);
        panelButtons.add(btnAddAutista);

        panelMain.add(panelButtons, BorderLayout.CENTER);

        textAreaLog = new JTextArea(10, 40);
        textAreaLog.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaLog);
        panelMain.add(scrollPane, BorderLayout.SOUTH);


        add(panelMain);
        setVisible(true);
    }

    private void updateLabels() {
        labelPasseggeriRimanenti.setText(String.valueOf(MAX_PASSEGGERI - passeggeriAttuali));
        labelAutistiRimanenti.setText(String.valueOf(MAX_AUTISTI - autistiAttuali));
    }

    private void addPasseggero() {
        try {
            if (passeggeriAttuali >= MAX_PASSEGGERI) {
                throw new PostiEsauritiPasseggeroException("Attenzione: Posti passeggeri esauriti!");
            }

            String nome = "NomePasseggero" + (passeggeriAttuali + 1);
            String cognome = "CognomePasseggero" + (passeggeriAttuali + 1);
            String codiceFiscale = "CFPASS" + (passeggeriAttuali + 1);
            String destinazione = "Destinazione" + (passeggeriAttuali + 1);
            boolean haBagaglio = (passeggeriAttuali % 2 == 0);

            Passeggero nuovoPasseggero = new Passeggero(nome, cognome, codiceFiscale, destinazione, haBagaglio);
            utentiRegistrati.add(nuovoPasseggero);
            passeggeriAttuali++;
            updateLabels();
            textAreaLog.append("Aggiunto: " + nuovoPasseggero.getTipo() + " " + nuovoPasseggero.getNome() + " " + nuovoPasseggero.getCognome() + "\n");
        } catch (PostiEsauritiPasseggeroException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Errore di Prenotazione", JOptionPane.ERROR_MESSAGE);
            textAreaLog.append("ERRORE: " + e.getMessage() + "\n");
        }
    }

    private void addAutista() {
        try {
            if (autistiAttuali >= MAX_AUTISTI) {
                throw new PostiEsauritiAutistaException("Attenzione: Posti autisti esauriti!");
            }

            String nome = "NomeAutista" + (autistiAttuali + 1);
            String cognome = "CognomeAutista" + (autistiAttuali + 1);
            String codiceFiscale = "CFAUT" + (autistiAttuali + 1);
            String patente = "D";
            int anniEsperienza = 5 + autistiAttuali;

            Autista nuovoAutista = new Autista(nome, cognome, codiceFiscale, patente, anniEsperienza);
            utentiRegistrati.add(nuovoAutista);
            autistiAttuali++;
            updateLabels();
            textAreaLog.append("Aggiunto: " + nuovoAutista.getTipo() + " " + nuovoAutista.getNome() + " " + nuovoAutista.getCognome() + "\n");
        } catch (PostiEsauritiAutistaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Errore di Prenotazione", JOptionPane.ERROR_MESSAGE);
            textAreaLog.append("ERRORE: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BusBookingApp());
    }
}