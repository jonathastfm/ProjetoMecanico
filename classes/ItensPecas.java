/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ao435
 */
public class ItensPecas {
    private int idItensPecas;
    private int quantidade;
    private float precoUnitario;
    private float valorFinal;
    private int idPecas;
    private int idOS;

    public ItensPecas(){};
    public ItensPecas(int idItensPecas, int quantidade, float precoUnitario, float valorFinal, int idPecas, int idOS) {
        this.idItensPecas = idItensPecas;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorFinal = valorFinal;
        this.idPecas = idPecas;
        this.idOS = idOS;
    }

    public int getIdItensPecas() {
        return idItensPecas;
    }

    public void setIdItensPecas(int idItensPecas) {
        this.idItensPecas = idItensPecas;
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

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getIdPecas() {
        return idPecas;
    }

    public void setIdPecas(int idPecas) {
        this.idPecas = idPecas;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }
}
