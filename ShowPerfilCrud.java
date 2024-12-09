import pages.ConectionCrud;
import java.util.Map;

public class ShowPerfilCrud {
    public static void main(String[] args) {
        ConectionCrud app = new ConectionCrud();
        Map<String, Object> result = app.getRow("cliente", "idcliente", "1");
        System.out.println(result);
    }
}
