package pages;




import java.sql.*;  
import javax.swing.*;

import classes.Cliente;

public class PerfilCrud {
    public PerfilCrud(JFrame parent) {
        JFrame frame = new JFrame("Perfil CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, parent, frame);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel, JFrame parent, JFrame frame) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Nome Completo:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(150, 20, 165, 25);
        panel.add(userText);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setBounds(10, 50, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(150, 50, 165, 25);
        panel.add(emailText);

        JLabel addressLabel = new JLabel("Endereço:");
        addressLabel.setBounds(10, 80, 80, 25);
        panel.add(addressLabel);

        JTextField addressText = new JTextField(20);
        addressText.setBounds(150, 80, 165, 25);
        panel.add(addressText);

        JLabel personTypeLabel = new JLabel("Tipo de Pessoa:");
        personTypeLabel.setBounds(10, 110, 100, 25);
        panel.add(personTypeLabel);

        JTextField personTypeText = new JTextField(20);
        personTypeText.setBounds(150, 110, 165, 25);
        panel.add(personTypeText);

        JLabel cpfLabel = new JLabel("CPF:");
        cpfLabel.setBounds(10, 140, 80, 25);
        panel.add(cpfLabel);

        JTextField cpfText = new JTextField(20);
        cpfText.setBounds(150, 140, 165, 25);
        panel.add(cpfText);

        JLabel phoneLabel = new JLabel("Telefones:");
        phoneLabel.setBounds(10, 170, 80, 25);
        panel.add(phoneLabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(150, 170, 165, 25);
        panel.add(phoneText);

        JLabel cnpjLabel = new JLabel("CNPJ:");
        cnpjLabel.setBounds(10, 200, 80, 25);
        panel.add(cnpjLabel);

        JTextField cnpjText = new JTextField(20);
        cnpjText.setBounds(150, 200, 165, 25);
        panel.add(cnpjText);

        JLabel contactLabel = new JLabel("Contato:");
        contactLabel.setBounds(10, 230, 80, 25);
        panel.add(contactLabel);

        JTextField contactText = new JTextField(20);
        contactText.setBounds(150, 230, 165, 25);
        panel.add(contactText);

        JLabel insEstaLabel = new JLabel("Inscrição Estadual:");
        insEstaLabel.setBounds(10, 260, 120, 25);
        panel.add(insEstaLabel);

        JTextField insEstaText = new JTextField(20);
        insEstaText.setBounds(150, 260, 165, 25);
        panel.add(insEstaText);

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(10, 300, 80, 25);
        backButton.addActionListener(e -> {
            frame.dispose();
            parent.setVisible(true);
        });


        JButton saveButton = new JButton("Salvar");
        saveButton.setBounds(150, 300, 80, 25);
        
        

        saveButton.addActionListener(e -> {
            String nomeCompleto = userText.getText();
            String email = emailText.getText();
            String endereco = addressText.getText();
            String tipoPessoa = personTypeText.getText();
            String cpf = cpfText.getText();
            String telefone1 = phoneText.getText();
            String cnpj = cnpjText.getText();
            String contato = contactText.getText();
            String inscricaoEstadual = insEstaText.getText();

            Cliente cliente = new Cliente(nomeCompleto, email, endereco, tipoPessoa);

            if (tipoPessoa.equals("fisica")) {
            cliente.inicializarPessoaFisica(cpf, telefone1, null);
            } else if (tipoPessoa.equals("juridica")) {
            cliente.inicializarPessoaJuridica(cnpj, contato, inscricaoEstadual);
            }

            try (Connection conn = ConectionCrud.connect()) {
                String sql = "INSERT INTO Cliente (nomecompleto, email, endereco, tipo_de_pessoa, cpf, telefone1, cnpj, contato, insesta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, cliente.getNomeCompleto());
                    pstmt.setString(2, cliente.getEmail());
                    pstmt.setString(3, cliente.getEndereco());
                    pstmt.setString(4, cliente.getTipoPessoa());
                    pstmt.setString(5, cliente.getCpf());
                    pstmt.setString(6, cliente.getTelefone1());
                    pstmt.setString(7, cliente.getCnpj());
                    pstmt.setString(8, cliente.getContato());
                    pstmt.setString(9, cliente.getInsEsta());
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(frame, "Dados salvos com sucesso!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar os dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(saveButton);


        panel.add(backButton);
    }


}



