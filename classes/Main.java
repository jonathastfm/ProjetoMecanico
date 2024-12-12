package classes;

import classes.Cliente;
import lib.Conecao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Instanciar o DAO
            Conecao conecao = new Conecao();
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

            // Criar um novo cliente (Pessoa Física)
            Cliente clienteFisico = new Cliente();
            clienteFisico.setNomeCompleto("João Silva");
            clienteFisico.setEmail("joao.silva@email.com");
            clienteFisico.setEndereco("Rua A, 123");
            clienteFisico.setTipoPessoa("Física");
            clienteFisico.setCpf("12345678900");
            clienteFisico.setTelefone1("99999-1111");
            clienteFisico.setTelefone2(null); // Não informado
            clienteFisico.setCnpj(null); // Não aplicável
            clienteFisico.setContato(null); // Não aplicável
            clienteFisico.setInsEsta(null); // Não aplicável

            // Adicionar o cliente ao banco
            System.out.println("Inserindo cliente Pessoa Física...");
            conecao.incluir(clienteFisico);
            System.out.println("Cliente Pessoa Física incluído com sucesso!");

            // Criar um novo cliente (Pessoa Jurídica)
            Cliente clienteJuridico = new Cliente();
            clienteJuridico.setNomeCompleto("Empresa XYZ");
            clienteJuridico.setEmail("contato@empresa.com");
            clienteJuridico.setEndereco("Avenida B, 456");
            clienteJuridico.setTipoPessoa("Jurídica");
            clienteJuridico.setCpf(null); // Não aplicável
            clienteJuridico.setTelefone1("88888-2222");
            clienteJuridico.setTelefone2("77777-3333");
            clienteJuridico.setCnpj("9876543210001");
            clienteJuridico.setContato("Joana");
            clienteJuridico.setInsEsta("12345678");

            // Adicionar o cliente ao banco
            System.out.println("Inserindo cliente Pessoa Jurídica...");
            clienteDAO.incluir(clienteJuridico);
            System.out.println("Cliente Pessoa Jurídica incluído com sucesso!");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
