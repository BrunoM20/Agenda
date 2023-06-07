/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author bruno
 */
public class ContatoPessoal extends Contato{
    
    private String dataAniversario;
    private String relacaoProximidade;

    public ContatoPessoal(int numeroContato, String nomeContato, String endereco, String email, String telefone, String dataAniversario, String relacaoProximidade) {
        super(numeroContato, nomeContato, endereco, email, telefone);
        this.dataAniversario = dataAniversario;
        this.relacaoProximidade = relacaoProximidade;
    }

    public ContatoPessoal(int numeroContato, String nomeContato, String endereco, String telefone, String dataAniversario, String relacaoProximidade) {
        super(numeroContato, nomeContato, endereco, telefone);
        this.dataAniversario = dataAniversario;
        this.relacaoProximidade = relacaoProximidade;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getRelacaoProximidade() {
        return relacaoProximidade;
    }

    public void setRelacaoProximidade(String relacaoProximidade) {
        this.relacaoProximidade = relacaoProximidade;
    }
    
  
    @Override
    public void mostraDetalheContato(){   
        System.out.println("\nNumero: " + this.getNumeroContato());
        System.out.println("Nome: " + this.getNomeContato());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Aniversario: " + this.dataAniversario);
        System.out.println("Relacao de Proximidade: " + this.relacaoProximidade);
    }
}
