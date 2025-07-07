package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class gui_prova extends JFrame {

    private JTextField textFieldNome;
    private JTextField textFieldCognome;
    private JTextField textFieldSpecific;
    private JLabel labelSpecific; 
    private JComboBox<String> typeComboBox;
    private ArrayList<Persona> listaPersone;

    public gui_prova() {
        setTitle("Gestione Persone");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        listaPersone = new ArrayList<>();

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel topPanel = new JPanel(new BorderLayout());
        typeComboBox = new JComboBox<>(new String[]{"Studente", "Professore"});
        typeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	aggiornaInput();
            }
        });
        JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        typePanel.add(new JLabel("Tipo:"));
        typePanel.add(typeComboBox);
        topPanel.add(typePanel, BorderLayout.EAST);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldNome = new JTextField(20);

        JLabel labelCognome = new JLabel("Cognome:");
        labelCognome.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldCognome = new JTextField(20);

        labelSpecific = new JLabel("Matricola:");
        labelSpecific.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldSpecific = new JTextField(20);

        inputPanel.add(labelNome);
        inputPanel.add(textFieldNome);
        inputPanel.add(labelCognome);
        inputPanel.add(textFieldCognome);
        inputPanel.add(labelSpecific);
        inputPanel.add(textFieldSpecific);

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String cognome = textFieldCognome.getText();
                String specificValue = textFieldSpecific.getText();
                String selectedType = (String) typeComboBox.getSelectedItem();

                if (nome.isEmpty() || cognome.isEmpty()) {
                    JOptionPane.showMessageDialog(gui_prova.this,
                            "Ci sono dei campi vuoti",
                            "Errore di Input",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Persona nuovaPersona = null;
                if ("Studente".equals(selectedType)) {
                    nuovaPersona = new Studente(nome, cognome, specificValue);
                } else if ("Professore".equals(selectedType)) {
                    nuovaPersona = new Professore(nome, cognome, specificValue);
                }

                if (nuovaPersona != null) {
                    listaPersone.add(nuovaPersona);
                    
                    textFieldNome.setText("");
                    textFieldCognome.setText("");
                    textFieldSpecific.setText("");

                    System.out.println("Lista attuale delle persone:");
                    for (Persona p : listaPersone) {
                        System.out.println(p);
                    }
                }
            }
        });
        buttonPanel.add(okButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);

        aggiornaInput();
    }

    private void aggiornaInput() {
        String selectedType = (String) typeComboBox.getSelectedItem();
        if ("Studente".equals(selectedType)) {
            labelSpecific.setText("Matricola:");
        } else if ("Professore".equals(selectedType)) {
            labelSpecific.setText("Dipartimento:");
        }
        textFieldSpecific.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new gui_prova());
    }
}