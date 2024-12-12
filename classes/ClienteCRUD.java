/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ao435
 */
import java.util.ArrayList;

public interface ClienteCRUD {
    public void incluir(Cliente objCliente) throws Exception;
    public ArrayList<Cliente> obterListaDeClientes() throws Exception;
}
