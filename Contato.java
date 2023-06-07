/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author bruno
 */
public abstract class Contato {
    
    private int numeroContato;
    private String nomeContato;
    private String endereco;
    private String email;
    private String telefone;

    public Contato(int numeroContato, String nomeContato, String endereco, String email, String telefone) {
        this.numeroContato = numeroContato;
        this.nomeContato = nomeContato;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Contato(int numeroContato, String nomeContato, String endereco, String telefone) {
        this.numeroContato = numeroContato;
        this.nomeContato = nomeContato;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public abstract void mostraDetalheContato();
}
