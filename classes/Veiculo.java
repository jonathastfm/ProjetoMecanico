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
public class Veiculo {
    private String placa;
    private int numPatrimonio;
    private int kilometragem;
    private Date dataEntrada;
    private Date anoFabricacao;
    private Date anoModelo;
    private String chassi;
    private int idModelo;

    public Veiculo(){};
    public Veiculo(String placa, int numPatrimonio, int kilometragem, Date dataEntrada, Date anoFabricacao, Date anoModelo, String chassi, int idModelo) {
        this.placa = placa;
        this.numPatrimonio = numPatrimonio;
        this.kilometragem = kilometragem;
        this.dataEntrada = dataEntrada;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.chassi = chassi;
        this.idModelo = idModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPatrimonio() {
        return numPatrimonio;
    }

    public void setNumPatrimonio(int numPatrimonio) {
        this.numPatrimonio = numPatrimonio;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }
    
}
