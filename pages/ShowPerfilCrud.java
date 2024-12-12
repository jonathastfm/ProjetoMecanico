package pages;

import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Cliente;

public class ShowPerfilCrud {
    public ShowPerfilCrud(JFrame parent, int id) {
        JFrame frame = new JFrame("Perfil CRUD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, parent, frame, id);

        frame.setVisible(true);
    }


    private void placeComponents(JPanel panel, JFrame parent, JFrame frame, int id) {
        panel.setLayout(null);

        Map<String, Object> info = Cliente.loadFromDatabaseAsMap(id);

        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel userLabel = new JLabel("Nome Completo: " + info.get("nomeCompleto"));
        panel.add(userLabel);

        JLabel emailLabel = new JLabel("E-mail: " + info.get("email"));
        panel.add(emailLabel);

        JLabel addressLabel = new JLabel("Endereço: " + info.get("endereco"));
        panel.add(addressLabel);

        JLabel personTypeLabel = new JLabel("Tipo de Pessoa: " + info.get("tipoPessoa"));
        panel.add(personTypeLabel);

        JLabel cpfLabel = new JLabel("CPF: " + info.get("cpf"));
        panel.add(cpfLabel);

        JLabel phone1Label = new JLabel("Telefone 1: " + info.get("telefone1"));
        panel.add(phone1Label);

        JLabel phone2Label = new JLabel("Telefone 2: " + info.get("telefone2"));
        panel.add(phone2Label);

        JLabel cnpjLabel = new JLabel("CNPJ: " + info.get("cnpj"));
        panel.add(cnpjLabel);

        JLabel contactLabel = new JLabel("Contato: " + info.get("contato"));
        panel.add(contactLabel);

        JLabel inscEstLabel = new JLabel("Inscrição Estadual: " + info.get("insest"));
        panel.add(inscEstLabel);
       
    }

}
