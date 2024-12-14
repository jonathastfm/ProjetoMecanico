
package pages;

import classes.Veiculo;

import javax.swing.*;
import java.awt.*;
import java.util.List;




    public class ShowCarrosCrud {
        

        public ShowCarrosCrud(JFrame parent, int id) {
            JFrame frame = new JFrame("Exibir Carros Cadastrados");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 600);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            frame.add(new JScrollPane(panel));
            


            // Essa lista deve vir do database

            List<Veiculo> Veiculo = java.util.Arrays.asList(
                new Veiculo(null, id, id, null, null, null, null, id)
            );

            placeComponents(panel, parent, frame, id, Veiculo);

            frame.setVisible(true);
        };

        
    private void placeComponents(JPanel panel, JFrame parent, JFrame frame, int id, List<Veiculo> veiculos) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       

        for (Veiculo veiculo : veiculos) {
            JPanel veiculoPanel = new JPanel();
            veiculoPanel.setLayout(new GridLayout(0, 2, 10, 10));
            veiculoPanel.setBorder(BorderFactory.createTitledBorder("Carro"));

            veiculoPanel.add(new JLabel("Placa:"));
            veiculoPanel.add(new JLabel(veiculo.getPlaca()));

            veiculoPanel.add(new JLabel("Número de Patrimônio:"));
            veiculoPanel.add(new JLabel(String.valueOf(veiculo.getNumPatrimonio())));

            veiculoPanel.add(new JLabel("Quilometragem:"));
            veiculoPanel.add(new JLabel(String.valueOf(veiculo.getKilometragem())));

            veiculoPanel.add(new JLabel("Data de Entrada:"));
            veiculoPanel.add(new JLabel("DATA"));

            veiculoPanel.add(new JLabel("Ano de Fabricação:"));
            veiculoPanel.add(new JLabel("DATA"));

            veiculoPanel.add(new JLabel("Ano do Modelo:"));
            veiculoPanel.add(new JLabel("DATA"));

            veiculoPanel.add(new JLabel("Chassi:"));
            veiculoPanel.add(new JLabel(veiculo.getChassi()));

            veiculoPanel.add(new JLabel("Modelo:"));
            veiculoPanel.add(new JLabel(String.valueOf(veiculo.getIdModelo())));

            panel.add(veiculoPanel);
        }

        JButton AddVeiculoButton = new JButton("Adicionar Carro");

        AddVeiculoButton.addActionListener(e -> {
            new CarrosCrud(frame);
            frame.setVisible(false);
        });

        JButton backButton = new JButton("Voltar");

        backButton.addActionListener(e -> {
            parent.setVisible(true);
            frame.dispose();
        });

        panel.add(AddVeiculoButton);

        panel.add(backButton);
    }
}