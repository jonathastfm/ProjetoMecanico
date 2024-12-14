import javax.swing.*;

import classes.Cliente;
import pages.AcessoriosCrud;
import pages.CarrosCrud;
import pages.ConectionCrud;
import pages.FuncionariosCrud;
import pages.PerfilCrud;
import pages.ServicosCrud;
import pages.ShowPerfilCrud;
import pages.ShowCarrosCrud;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;



public class Main {
    

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> mainScreen());
        
    }

    private static void mainScreen() {
        JFrame frame = new JFrame("Exemplo de JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 600);
        
        // Create a panel 
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30)); 

        // Create title label
        JLabel titleLabel = new JLabel("Mecanica do dimas");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Fetch client names from the database
        java.util.List<String> clientNames = new java.util.ArrayList<>();
        final int[] idAtual = {3}; // Use an array to hold the idAtual value
        
        try(Connection conn = ConectionCrud.connect()){
            String query = "SELECT idCliente, nomeCompleto FROM cliente";
            try (java.sql.Statement stmt = conn.createStatement();
                 java.sql.ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    idAtual[0] = rs.getInt("idCliente");
                    clientNames.add(rs.getString("nomeCompleto"));
                }
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        

        // Create a comboBox for client names
        JComboBox<String> clientNamesComboBox = new JComboBox<>(clientNames.toArray(new String[0]));
        clientNamesComboBox.setPreferredSize(new Dimension(200, 35));

        // Add the comboBox to the panel
        panel.add(clientNamesComboBox);
        
        // Create buttons
        JButton button1 = new JButton("Registrar carro");
        JButton button2 = new JButton("Registrar Servicos");
        JButton button3 = new JButton("Cadastrar Funcionarios");
        JButton button4 = new JButton("Cadastrar Cliente");
        JButton button5 = new JButton("Perfil");
        
        // Set button sizes
        button1.setPreferredSize(new Dimension(200, 35));
        button2.setPreferredSize(new Dimension(200, 35));
        button3.setPreferredSize(new Dimension(200, 35));
        button4.setPreferredSize(new Dimension(200, 35));
        button5.setPreferredSize(new Dimension(200, 35));


        // Add ActionListener to button1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShowCarrosCrud(frame, idAtual[0]);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ServicosCrud(frame);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FuncionariosCrud(frame);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PerfilCrud(frame, idAtual[0]);
            }
        });

        button5.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try(Connection conn = ConectionCrud.connect()){
                    String query = "SELECT idCliente FROM cliente WHERE nomeCompleto = '"+clientNamesComboBox.getSelectedItem()+"'";
                    try (java.sql.Statement stmt = conn.createStatement();
                        java.sql.ResultSet rs = stmt.executeQuery(query)) {
                        while (rs.next()) {
                            idAtual[0] = rs.getInt("idCliente");
                        }
                    }
                } catch (java.sql.SQLException ex) {
                    ex.printStackTrace();
                }
                new ShowPerfilCrud(frame, idAtual[0]);
            }
        });


        panel.add(titleLabel);

        panel.add(clientNamesComboBox);

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        
        // Add the panel to the frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}