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
public class OrdemServico {
    private int idOS;
    private Date dataInicio;
    private Date dataFim;
    private String status;
    private float valorFinal;
    private float valorPago;
    private float valorRestante;
    private String placa;

    public OrdemServico(){};
    public OrdemServico(int idOS, Date dataInicio, Date dataFim, String status, float valorFinal, float valorPago, float valorRestante, String placa) {
        this.idOS = idOS;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.valorFinal = valorFinal;
        this.valorPago = valorPago;
        this.valorRestante = valorRestante;
        this.placa = placa;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public float getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(float valorRestante) {
        this.valorRestante = valorRestante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
