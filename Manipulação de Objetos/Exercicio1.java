// Classe Pessoa
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author IGOR
 */

/*
1) Crie uma classe Pessoa com os atributos nome, idade e cidade. Crie métodos
para exibir as informações e para alterar a cidade. Instancie 3 objetos diferentes e
mostre as alterações.
*/

public class Pessoa {
    
    String nome;
    int idade;
    private String cidade;
    
    public void exibirInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cidade: "+cidade+"\n");
    }
    
    public String alterarCidade(String cidade){
        this.cidade = cidade;
        return this.cidade;
    }
    
}

//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[]args){
     
        Pessoa joel = new Pessoa();
        joel.nome = "Joel";
        joel.idade = 18;
        joel.alterarCidade("Jacarepaguá");
        
        Pessoa manu = new Pessoa();
        manu.nome = "Manuella";
        manu.idade = 22;
        manu.alterarCidade("Xique-Xique");
        
        Pessoa igor = new Pessoa();
        igor.nome = "Igor";
        igor.idade = 16;
        igor.alterarCidade("Rolândia");
        
        joel.exibirInfos();
        igor.exibirInfos();
        manu.exibirInfos();
        
    }
    
}
