/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.Date;

/**
 *
 * @author ao435
 */

public class Proprietarios {
    private int idProprietario;
    private Date dataInicio;
    private Date dataFim;
    private int idCliente; // ID do cliente, chave estrangeira
    private String placa;

    public Proprietarios(){};
    public Proprietarios(int idProprietario, Date dataInicio, Date dataFim, int idCliente, String placa, Cliente cliente) {
        this.idProprietario = idProprietario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idCliente = idCliente;
        this.placa = placa;
    }

    // Adicionando um campo Cliente para armazenar os dados do cliente
    private Cliente cliente; // Objeto Cliente associado ao Proprietário

    // Getters e Setters
    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    // Agora o getter e setter do idCliente vai funcionar diretamente
    // como uma chave estrangeira no banco de dados
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
