package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class AcessoriosCrud extends JFrame {

    public AcessoriosCrud(JFrame parentFrame) {
        setTitle("Registrar Acessório");
        setSize(400, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(parentFrame);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        // Create title label
        JLabel titleLabel = new JLabel("Registrar Acessório");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Create input fields
        JTextField nomeField = new JTextField();
        nomeField.setPreferredSize(new Dimension(200, 30));
        JTextField descricaoField = new JTextField();
        descricaoField.setPreferredSize(new Dimension(200, 30));
        JTextField veiculoField = new JTextField();
        veiculoField.setPreferredSize(new Dimension(200, 30));

        // Create labels for input fields
        JLabel nomeLabel = new JLabel("Nome:");
        JLabel descricaoLabel = new JLabel("Descrição:");
        JLabel veiculoLabel = new JLabel("Veículo:");

        // Create save button
        JButton saveButton = new JButton("Salvar");
        saveButton.setPreferredSize(new Dimension(200, 40));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to save the accessory
                String nome = nomeField.getText();
                String descricao = descricaoField.getText();
                String veiculo = veiculoField.getText();
                // Save the accessory details
                JOptionPane.showMessageDialog(null, "Acessório salvo com sucesso!");
            }
        });

        // Add components to the panel
        panel.add(titleLabel);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(descricaoLabel);
        panel.add(descricaoField);
        panel.add(veiculoLabel);
        panel.add(veiculoField);
        panel.add(saveButton);

        // Add the panel to the frame
        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }
}