/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author bruno
 */
public class Agenda {
    
    private Contato contatos[] = new Contato[100];
    
    public void insertContato(Contato cont) throws VetorCheio{
        
        if (buscaContato(cont.getNumeroContato())==null){
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i]==null){
                    contatos[i] = cont;
                    return;
                }
            }
        }
        else {
            System.out.println("\nContato ja cadastrado");
        }
        throw new VetorCheio();
    }
    
    public Contato buscaContato(int numero){
        
        Contato a = null;
        
        for (int i=0; i < contatos.length; i++){
            if (contatos[i] != null && contatos[i].getNumeroContato()==numero){
                a = contatos[i];
                return a; 
            }
        }
        return a;
    }
    
    public Contato deleteContato(int numero){
        
        Contato a = null;
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null){
                if (contatos[i].getNumeroContato() == numero){
                    a = contatos[i];
                    contatos[i] = null;
                    System.out.println("Contato " + a.getNomeContato() + " foi deletado com sucesso\n");
                    return a;
                }
            }
        }
        System.out.println("Contato nao encontrado\n");
        return a;
    }
    
    public void updateContato(Contato cont){
        int id = cont.getNumeroContato();
        boolean contatoEncontrado = false;
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].getNumeroContato() == id){
                contatoEncontrado = true;
                
                if (contatos[i].getClass() == cont.getClass()){
                    contatos[i] = cont;
                    System.out.println("Contato atualizado com sucesso\n");
                } else{
                    System.out.println("Os contatos nao sao da mesma classe\n");
                } 
                break;
            }
        }
        if (!contatoEncontrado){
            System.out.println("Contato nao encontrado\n");
        }
    }
    
    public ContatoPessoal[] obtemContatoPessoal(){
            
        int contador = 0;
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoPessoal){
                contador++;
            }
        }
        
        ContatoPessoal[] cp = new ContatoPessoal[contador];
        int index = 0;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoPessoal){
                cp[index] = (ContatoPessoal)contatos[i];
                index++;
            }
        }
        
        return cp;
    }
    
    public ContatoProfissional[] obtemContatoProfissional(){
        
        int contador = 0;
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoProfissional){
                contador++;    
            }
        }
        
        ContatoProfissional[] cpf = new ContatoProfissional[contador];
        int index = 0;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoProfissional){
                cpf[index] = (ContatoProfissional)contatos[i];
                index++;
            }
        }
        
        return cpf;
    }
    
    public ContatoPessoal[] obtemAniversariante(String data) {
        String[] parts = data.split("/");
        String dia = parts[0];
        String mes = parts[1];
    
        int contador = 0;
    
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoPessoal) {
                ContatoPessoal contatoPessoal = (ContatoPessoal)contatos[i];
                String[] aniversarioParts = contatoPessoal.getDataAniversario().split("/");
                String aniversarioDia = aniversarioParts[0];
                String aniversarioMes = aniversarioParts[1];
    
                if (dia.equals(aniversarioDia) && mes.equals(aniversarioMes)) {
                    contador++;
                }
            }
        }
    
        ContatoPessoal[] aniversariantes = new ContatoPessoal[contador];
        int index = 0;
    
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i] instanceof ContatoPessoal) {
                ContatoPessoal contatoPessoal = (ContatoPessoal) contatos[i];
                String[] aniversarioParts = contatoPessoal.getDataAniversario().split("/");
                String aniversarioDia = aniversarioParts[0];
                String aniversarioMes = aniversarioParts[1];
    
                if (dia.equals(aniversarioDia) && mes.equals(aniversarioMes)) {
                    aniversariantes[index] = contatoPessoal;
                    index++; // Incrementa o índice após adicionar um contato
                }
            }
        }
        
        for (int i = 0; i < aniversariantes.length; i++) {
            if (aniversariantes[i] != null){
                System.out.println("Aniversariante: " + aniversariantes[i].getNomeContato());
            }
        }
        System.out.println(""); //espaço
        return aniversariantes;
    }
    
    public void mostrarAgenda(){
        
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null){
                System.out.println("ID: " + contatos[i].getNumeroContato());
                System.out.println("Nome: " + contatos[i].getNomeContato());
                System.out.println("Endereco: " + contatos[i].getEndereco());
                System.out.println("Email: " + contatos[i].getEmail());
                System.out.println("Telefone: " + contatos[i].getTelefone());
                System.out.println("-------------------------------------------");
            }
        }
    }
    
}