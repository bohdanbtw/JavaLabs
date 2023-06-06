import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioactiveDecayCalculator extends JFrame {
    private JTextField lambdaField;
    private JTextField initialNField;
    private JTextField timeField;
    private JLabel resultLabel;

    public RadioactiveDecayCalculator() {
        setTitle("Radioactive Decay Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5)); // Зміна розташування компонентів

        // Labels
        JLabel lambdaLabel = new JLabel("Decay constant (λ):");
        JLabel initialNLabel = new JLabel("Initial number of nuclei (N₀):");
        JLabel timeLabel = new JLabel("Time (t):");
        JLabel resultTextLabel = new JLabel("Number of nuclei decayed (N):");
        resultLabel = new JLabel();

        // Text fields
        lambdaField = new JTextField();
        initialNField = new JTextField();
        timeField = new JTextField();

        // Button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateDecayedNuclei();
            }
        });

        // Add components to the frame
        add(lambdaLabel);
        add(lambdaField);
        add(initialNLabel);
        add(initialNField);
        add(timeLabel);
        add(timeField);
        add(resultTextLabel);
        add(resultLabel);
        add(calculateButton);

        // Set empty borders for labels and text fields to add spacing
        lambdaLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lambdaField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        initialNLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        initialNField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        timeLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        timeField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        resultTextLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        resultLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        calculateButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        setVisible(true);
    }

    private void calculateDecayedNuclei() {
        double lambda = Double.parseDouble(lambdaField.getText());
        double initialN = Double.parseDouble(initialNField.getText());
        double time = Double.parseDouble(timeField.getText());

        double decayedNuclei = initialN * Math.exp(-lambda * time);

        resultLabel.setText(String.format("%.2f", decayedNuclei));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RadioactiveDecayCalculator();
            }
        });
    }
}