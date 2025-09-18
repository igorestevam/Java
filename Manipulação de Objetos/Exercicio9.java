//Classe Contato
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9;

/**
 *
 * @author IGOR
 */

public class Contato {
    private String nome;
    private String telefone;
    
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
}

//Classe Agenda

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9;

/**
 *
 * @author IGOR
 */

import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato> listaContatos;
    
    public Agenda(){
        listaContatos = new ArrayList<>();
    }
    
    public void addContato(Contato c){
        listaContatos.add(c);
        System.out.println(c.getNome()+" foi adicionado(a)!\n");
    }
    
    public void buscarContato(String nome){
        boolean achou = false;
        for (Contato c : listaContatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                System.out.println("Contato encontrado: ");
                System.out.println("Nome: "+c.getNome());
                System.out.println("Telefone: "+c.getTelefone()+"\n");
                achou = true;
                break;
            }
        }
        if(achou == false){
            System.out.println("Contato não encontrado ou inexistente.\n");
        }
    }
    
    public void removerContato(String num){
        boolean achou = false;
        for (Contato c : listaContatos) {
            if(c.getTelefone().equalsIgnoreCase(num)){
                listaContatos.remove(c);
                System.out.println("Contato removido: ");
                System.out.println("Nome: "+c.getNome());
                System.out.println("Telefone: "+c.getTelefone()+"\n");
                achou = true;
                break;
            }
        }
        if(achou == false){
            System.out.println("Contato não encontrado ou inexistente.\n");
        }
    }
}

//Classe main
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[]args){
        Agenda agenda = new Agenda();
        
        Contato c1 = new Contato("Igor","2799999-9999");
        Contato c2 = new Contato("Manu","2788888-8888");
        Contato c3 = new Contato("Joel","2777777-7777");
        
        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        
        agenda.buscarContato("Igor");
        agenda.buscarContato("Manu");
        
        agenda.removerContato("2777777-7777");
    }
    
}
