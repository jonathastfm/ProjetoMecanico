package pages;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lib.Conecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

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

        
        Map<String, String> fields = new HashMap<>();

        try (Connection connection = Conecao.getConnection()) {
            String query = "SELECT nome, cpf FROM cliente";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                fields.put(resultSet.getString("field_name"), resultSet.getString("field_value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
