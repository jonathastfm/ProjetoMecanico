/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ao435
 */
public class ItensServico {
    private int idItensServico;
    private int quantidade;
    private float precoUnitario;
    private float valorTotal;
    private int idServico;
    private int idFuncionario;
    private int idOS;

    public ItensServico(){};
    public ItensServico(int idItensServico, int quantidade, float precoUnitario, float valorTotal, int idServico, int idFuncionario, int idOS) {
        this.idItensServico = idItensServico;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorTotal = valorTotal;
        this.idServico = idServico;
        this.idFuncionario = idFuncionario;
        this.idOS = idOS;
    }

    public int getIdItensServico() {
        return idItensServico;
    }

    public void setIdItensServico(int idItensServico) {
        this.idItensServico = idItensServico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }
}
