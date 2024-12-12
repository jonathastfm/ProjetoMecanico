/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ao435
 */
public class Pecas {
    private int idPecas;
    private String descricao;
    private int codiogFab;
    private int quantidade;
    private float valorUnitario;

    public Pecas(){};
    public Pecas (int idPecas, String descricao, int codigoFab, int quantidade, float valorUnitario){
        this.idPecas=idPecas;
        this.descricao=descricao;
        this.codiogFab=codigoFab;
        this.quantidade=quantidade;
        this.valorUnitario=valorUnitario;
    }
    
    public int getIdPecas() {
        return idPecas;
    }

    public void setIdPecas(int idPecas) {
        this.idPecas = idPecas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodiogFab() {
        return codiogFab;
    }

    public void setCodiogFab(int codiogFab) {
        this.codiogFab = codiogFab;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
