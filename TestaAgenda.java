/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author bruno
 */
public class TestaAgenda {
    public static void main(String[] args) {
        
        Agenda ag = new Agenda();
        ContatoPessoal cp1 = new ContatoPessoal(1,"Leonardo","Rua Tiradentes","leo.p@gmail.com","35967892315","25/06/1998","Primo");
        ContatoPessoal cp2 = new ContatoPessoal(2,"Claudia","Rua da Saudade","claudinhapl@gmail.com","16998754623","15/07/1989","Tia");
        ContatoProfissional cpf1 = new ContatoProfissional(3,"Augusto","Travessa 3 Coracoes","augusto.corp@corp.gov","16985792365","Telinveste","Gerente");
        ContatoProfissional cpf2 = new ContatoProfissional(3,"Lorena","Travessa Lemos","lorena.corp@corp.gov","16985236479","Telinveste","Atendente");
        ContatoPessoal cp3 = new ContatoPessoal(4,"Arminda","Travessa Tiradentes","35998754123","04/02/1965","Vo");
        ContatoPessoal cp4 = new ContatoPessoal(5,"Jose","Rua Gabz","jase@gmail.com", "16936568521","05/08/1973","Tio");
        ContatoPessoal cp5 = new ContatoPessoal(6,"Ronaldo","Rua Donizete Pereira", "roni09@gmail.com","16995867413","05/08/1985","Pai");
        ContatoPessoal cp6 = new ContatoPessoal(7,"Andre","Rua Santo Antio","andrezinho20@gmail.com","35998751523","04/08/2003","Primo");
        try{
            ag.insertContato(cp1);
            ag.insertContato(cp2);
            ag.insertContato(cpf1);
            ag.insertContato(cp3);
            ag.insertContato(cp4);
            ag.insertContato(cp5);
            ag.insertContato(cp6);
        }
        
        catch(VetorCheio e){
            System.out.println("Excecao gerada: " + e);
        }
        
        ag.deleteContato(7);
        
        ag.updateContato(cpf2);
        
        ag.obtemAniversariante("05/08/2003");
        
        ag.mostrarAgenda();
    }
}
