package pages;

import java.util.ArrayList;
import java.util.List;
import classes.Marca;
import classes.Modelo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    
public class MarcaModeloCrud {
            

    private List<Marca> marcas;
    private List<Modelo> modelos;

    public MarcaModeloCrud(JFrame parent) {
        marcas = List.of(
            new Marca(1, "Toyota"),
            new Marca(2, "Honda"),
            new Marca(3, "Ford"),
            new Marca(4, "Chevrolet"),
            new Marca(5, "BMW")
        );
        modelos = new ArrayList<>();
        JFrame frame = new JFrame("Marca e Modelo CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, parent, frame, marcas, modelos);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel, JFrame parent, JFrame frame, List<Marca> marcas, List<Modelo> modelos) {
                panel.setLayout(new FlowLayout());

                panel.add(new JLabel(".                     Marca                     ."));
                JTextField marcaField = new JTextField(20);
                marcaField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                panel.add(marcaField);

                JComboBox<String> marcaComboBox = new JComboBox<>(marcas.stream().map(Marca::getMarca).toArray(String[]::new));
                marcaComboBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                panel.add(marcaComboBox);

                JButton addMarcaButton = new JButton("Adicionar Marca");

                addMarcaButton.setPreferredSize(new Dimension(300, 30));

                addMarcaButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Adicionar Marca");
                    }
                });

                panel.add(addMarcaButton);

                
                panel.add(Box.createVerticalStrut(100));

                panel.add(new JLabel(".               Modelo              ."));
                JTextField modeloField = new JTextField(30);
                modeloField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                panel.add(modeloField);

                panel.add(new JLabel("Marca do Modelo"));
                

                JButton addModeloButton = new JButton("Adicionar Modelo");
                addModeloButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String modeloNome = modeloField.getText();
                        Marca selectedMarca = (Marca) marcaComboBox.getSelectedItem();
                        if (!modeloNome.isEmpty() && selectedMarca != null) {
                            Modelo modelo = new Modelo(modelos.size() + 1, modeloNome, selectedMarca.getIdMarca());
                            modelos.add(modelo);
                            JOptionPane.showMessageDialog(panel, "Modelo adicionado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(panel, "Os campos Modelo e Marca do Modelo não podem estar vazios.");
                        }
                    }
                });
                panel.add(addModeloButton);
            }

            public static void main(String[] args) {
                JFrame parentFrame = new JFrame();
                
                new MarcaModeloCrud(parentFrame);
            }
        }
        

