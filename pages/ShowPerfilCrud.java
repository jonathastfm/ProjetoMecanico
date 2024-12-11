package pages;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShowPerfilCrud {
    public ShowPerfilCrud(JFrame parent) {
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

        Map<String, String> fields = Map.of(
            "Nome Completo", "userText",
            "E-mail", "emailText",
            "Endereço", "addressText",
            "Tipo de Pessoa", "personTypeText",
            "CPF", "cpfText"
        );

        int y = 20;
        for (Map.Entry<String, String> entry : fields.entrySet()) {
            String label = entry.getKey();
            String text = entry.getValue();

            JLabel userLabel = new JLabel(label);
            userLabel.setBounds(10, y, 80, 25);
            panel.add(userLabel);

            JTextField userText = new JTextField(20);
            userText.setBounds(150, y, 165, 25);
            panel.add(userText);

            y += 30;
        }
    }

}
