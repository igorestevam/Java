//Classe Produto

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author IGOR
 */

/*
3) Crie uma classe Produto com os atributos nome, preco e quantidade. Faça um
método para calcular o valor total do estoque do produto. Crie uma lista de objetos
Produto e exiba o valor total do estoque da loja.
*/
public class Produto {
    
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double valorTotalEstoque(){
        double valorTotal = preco * quantidade;
        return valorTotal;
    }
 
}

//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author IGOR
 */
import java.util.List;
import java.util.ArrayList;
public class main {
    public static void main(String[]args){
        List<Produto> listaProdutos= new ArrayList<>();
        
        listaProdutos.add(new Produto("Leite", 7.00, 10));
        listaProdutos.add(new Produto("Ovo", 12.00, 8));
        listaProdutos.add(new Produto("Maizena", 8.00, 20));
        
        double valorTotalLoja = 0;
        
        for(Produto p : listaProdutos){
            System.out.println(p.nome+" || Valor total do estoque: R$"+p.valorTotalEstoque());
            valorTotalLoja += p.valorTotalEstoque();
        }
        
        System.out.println("Valor total do estoque da loja: R$ "+valorTotalLoja);
    }
}
