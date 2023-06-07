/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author bruno
 */
public class ContatoProfissional extends Contato{
    
    private String empresaTrabalho;
    private String cargo;

    public ContatoProfissional(int numeroContato, String nomeContato, String endereco, String email, String telefone, String empresaTrabalho, String cargo) {
        super(numeroContato, nomeContato, endereco, email, telefone);
        this.empresaTrabalho = empresaTrabalho;
        this.cargo = cargo;
    }

    public ContatoProfissional(int numeroContato, String nomeContato, String endereco, String telefone, String empresaTrabalho, String cargo) {
        super(numeroContato, nomeContato, endereco, telefone);
        this.empresaTrabalho = empresaTrabalho;
        this.cargo = cargo;
    }

    public String getEmpresaTrabalho() {
        return empresaTrabalho;
    }

    public void setEmpresaTrabalho(String empresaTrabalho) {
        this.empresaTrabalho = empresaTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostraDetalheContato() { 
        System.out.println("\nNumero: " + this.getNumeroContato());
        System.out.println("Nome: " + this.getNomeContato());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Empresa: " + this.empresaTrabalho);
        System.out.println("Cargo: " + this.cargo);
    }
}
