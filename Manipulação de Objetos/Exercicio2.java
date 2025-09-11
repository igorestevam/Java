//Classe ContaBancaria

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author IGOR
 */

/*
2) Crie uma classe ContaBancaria com os atributos titular, saldo e numero.
Implemente métodos para depositar, sacar (verificando saldo) e exibir saldo, Crie
dois objetos e simule transações entre eles.
*/

public class ContaBancaria {
    
    String titular;
    double saldo;
    String numero;
    
    public double depositar(double valorDeposito){
        saldo += valorDeposito;
        return saldo;
    }
    
    public double sacar(double valorSaque){
        if(saldo >= valorSaque){
            saldo -= valorSaque;
        }else{
            System.out.println(titular+", você não possui saldo suficiente.");
        }
        return saldo;
    }
    
    public double exibirSaldo(){
        return saldo;
    }
    
}


//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[]args){
     
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Cláudio Romero";
        c1.saldo = 1000;
        c1.numero = "11111-1";
        
        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Rasputina Calabrea";
        c2.saldo = 3000;
        c2.numero = "22222-2";
        
        c1.depositar(500);
        c1.sacar(1000);
        c2.depositar(1000);
        c2.sacar(500);
        System.out.println("Saldo do cliente 1: "+c1.exibirSaldo());
        System.out.println("Saldo do cliente 2: "+c2.exibirSaldo());
        
    }
}
