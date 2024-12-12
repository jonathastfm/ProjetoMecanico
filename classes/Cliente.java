/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.HashMap;
import java.util.Map;

import pages.ConectionCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ao435
 */
public class Cliente {
    
    private int idCliente;
    private String nomeCompleto;
    private String email;
    private String endereco;
    private String tipoPessoa;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String cnpj;
    private String contato;
    private String InsEsta;
    
    //construtor
    public Cliente() {};
    public Cliente(String nomeCompleto, String email, String endereco, String tipoPessoa) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;

        //validação
        if (!tipoPessoa.equals("fisica") && !tipoPessoa.equals("juridica")) {
            throw new IllegalArgumentException("Tipo de pessoa deve ser 'Física' ou 'Jurídica'.");
        }
    }

    //metodos para determinar qual inicializar
    public void inicializarPessoaFisica(String cpf, String telefone1, String telefone2) {
        if (!tipoPessoa.equals("fisica")) {
            throw new IllegalStateException("Cliente não é do tipo 'Física'.");
        }
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }

    public void inicializarPessoaJuridica(String cnpj, String contato, String insEsta) {
        if (!tipoPessoa.equals("juridica")) {
            throw new IllegalStateException("Cliente não é do tipo 'Jurídica'.");
        }
        this.cnpj = cnpj;
        this.contato = contato;
        this.InsEsta = InsEsta;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getInsEsta() {
        return InsEsta;
    }

    public String setInsEsta(String InsEsta) {
        return this.InsEsta;
    }

    
    public static Map<String, Object> loadFromDatabaseAsMap(int id) {
        Map<String, Object> result = new HashMap<>();
        String query = "SELECT * FROM cliente WHERE idCliente = ?";

        try (Connection conn = ConectionCrud.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                result.put("idCliente", rs.getInt("idCliente"));
                result.put("nomeCompleto", rs.getString("nomeCompleto"));
                result.put("email", rs.getString("email"));
                result.put("endereco", rs.getString("endereco"));
                result.put("tipoPessoa", rs.getString("tipo_de_pessoa"));
                result.put("cpf", rs.getString("cpf"));
                result.put("telefone1", rs.getString("telefone1"));
                result.put("telefone2", rs.getString("telefone2"));
                result.put("cnpj", rs.getString("cnpj"));
                result.put("contato", rs.getString("contato"));
                result.put("InsEsta", rs.getString("InsEsta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
