package pages;


import javax.swing.*;

import java.awt.FlowLayout;


public class CarrosCrud {
    public CarrosCrud(JFrame parent) {
        JFrame frame = new JFrame("Carros CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, parent, frame);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel, JFrame parent, JFrame frame) {

        
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        panel.add(new JLabel("Nome"));
        JTextField nomeField = new JTextField(30);
        nomeField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(nomeField);

        panel.add(new JLabel("Placa"));
        JTextField placaField = new JTextField(30);
        placaField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(placaField);

        panel.add(new JLabel("Número de Patrimônio"));
        JTextField patrimonioField = new JTextField(20);
        patrimonioField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(patrimonioField);

        panel.add(new JLabel("Quilometragem"));
        JTextField quilometragemField = new JTextField(20);
        quilometragemField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(quilometragemField);

        panel.add(new JLabel("Data de Entrada"));
        JTextField dataEntradaField = new JTextField(20);
        dataEntradaField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(dataEntradaField);

        panel.add(new JLabel("Ano de Fabricação"));
        JTextField anoFabricacaoField = new JTextField(20);
        anoFabricacaoField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(anoFabricacaoField);

        panel.add(new JLabel("Ano do Modelo"));
        JTextField anoModeloField = new JTextField(24);
        anoModeloField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(anoModeloField);

        panel.add(new JLabel("Chassi"));
        JTextField chassiField = new JTextField(27);
        chassiField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(chassiField);

        panel.add(new JLabel("Modelo"));
        JComboBox<String> modeloComboBox = new JComboBox<>(new String[]{"Modelo A", "Modelo B", "Modelo C"});
        modeloComboBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(modeloComboBox);

        

        JButton backButton = new JButton("Voltar para o Menu");
        backButton.addActionListener(e -> {
            frame.dispose();
            parent.setVisible(true);
        });
        backButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton addMarcaModeloButton = new JButton("Adicionar Marca/Modelo");
        addMarcaModeloButton.addActionListener(e -> {
            new MarcaModeloCrud(frame);
            frame.setVisible(false);
        });
        panel.add(addMarcaModeloButton);
        

        JButton saveButton = new JButton("Salvar");
        panel.add(saveButton);
        panel.add(backButton);

    }
}



