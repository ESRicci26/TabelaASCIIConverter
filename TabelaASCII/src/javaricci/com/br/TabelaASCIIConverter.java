package javaricci.com.br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TabelaASCIIConverter extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextField decimalField;
    private JTextField binaryField;
    private JTextField hexadecimalField;
    private JTextField letterField;

    public TabelaASCIIConverter() {
        setTitle("Tabela de Conversão ASCII");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        // Labels
        JLabel decimalLabel = new JLabel("Decimal:");
        JLabel binaryLabel = new JLabel("Binario:");
        JLabel hexadecimalLabel = new JLabel("Hexadecimal:");
        JLabel letterLabel = new JLabel("Letra/Código:");

        // Text Fields
        decimalField = new JTextField();
        binaryField = new JTextField();
        hexadecimalField = new JTextField();
        letterField = new JTextField();

        binaryField.setEditable(false);
        hexadecimalField.setEditable(false);
        letterField.setEditable(false);

        // Adicionar componentes ao FRAME
        add(decimalLabel);
        add(decimalField);
        add(binaryLabel);
        add(binaryField);
        add(hexadecimalLabel);
        add(hexadecimalField);
        add(letterLabel);
        add(letterField);

        // Adicionar Key Listener para campo decimal
        decimalField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                convertDecimal();
            }
        });

        setVisible(true);
    }

    private void convertDecimal() {
        String decimalText = decimalField.getText();
        try {
            int decimalValue = Integer.parseInt(decimalText);

            // Converter para Binário
            String binaryValue = Integer.toBinaryString(decimalValue);
            binaryField.setText(binaryValue);

            // Converter para Hexadecimal
            String hexadecimalValue = Integer.toHexString(decimalValue).toUpperCase();
            hexadecimalField.setText(hexadecimalValue);

            // Converter para Caracteres
            if (decimalValue >= 0 && decimalValue <= 255) {
                char letterValue = (char) decimalValue;
                letterField.setText(Character.toString(letterValue));
            } else {
                letterField.setText("N/A");
            }
        } catch (NumberFormatException e) {
            binaryField.setText("");
            hexadecimalField.setText("");
            letterField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TabelaASCIIConverter::new);
    }
}
