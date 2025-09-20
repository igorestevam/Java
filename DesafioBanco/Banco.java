/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiobanco;

/**
 *
 * @author alunolab10
 */
import java.util.ArrayList;
public class Banco {
    private ArrayList<Conta> listaContas;
    
    public Banco(){
        listaContas = new ArrayList<>();
    }
    
    public void addConta(Conta c){
        listaContas.add(c);
    }
    
    public void removeConta(String num){
        boolean achou = false;
        for (Conta c : listaContas) {
            if(c.getNum().equalsIgnoreCase(num)){
                listaContas.remove(c);
                System.out.println("Conta removida!");
                achou = true;
                break;
            }else{
                break;
            }
        }
        if(achou){
            System.out.println("Número não encontrado ou inexistente.");
        }
    }
    
    public void consultarConta(String num){
        boolean achou = false;
        for (Conta c : listaContas) {
            if(c.getNum().equalsIgnoreCase(num)){
                System.out.println("Conta encontrada: ");
                System.out.println("Nome: "+c.getNome());
                System.out.println("Número da conta: "+c.getNum());
                System.out.println("Saldo: "+c.getSaldo());
                System.out.println("Agência: "+c.getAgencia());
                achou = true;
                break;
            }else{
                break;
            }
        }
        if(achou){
            System.out.println("Número não encontrado ou inexistente.");
        }
    }
    
    public void transacaoContas(String num1, String num2, float valor){
        boolean achou1 = false;
        boolean achou2 = false;
        Conta c1 = null;
        Conta c2 = null;
        for (Conta c : listaContas) {
            if(c.getNum().equalsIgnoreCase(num1)){
                achou1 = true;
                c1 = c;
                break;
            }else{
                break;
            }
        }
        if(achou1){
            System.out.println("Número da primeira conta não encontrado ou inexistente.");
        }
        for(Conta c: listaContas){
            if(c.getNum().equalsIgnoreCase(num2)){
                achou2 = true;
                c2 = c;
                break;
            }else{
                break;
            }
        }
        if(achou2){
            System.out.println("Número da segunda conta não encontrado ou inexistente.");
        }
        if(achou1 == true && achou2 == true){
            c1.sacar(valor);
            c2.depositar(valor);
            System.out.printf("Saldo do "+c1.getNome()+": R$%.2f\n",c1.getSaldo());
            System.out.printf("Saldo do "+c2.getNome()+": R$%.2f\n",c2.getSaldo());
        }
    }
    
    public void depConta(String num, float valor){
        boolean achou = false;
        for (Conta c : listaContas) {
            if(c.getNome().equalsIgnoreCase(num)){
                c.depositar(valor);
                System.out.println("Depósito realizado!");
                System.out.println("Saldo da conta: R$"+c.getSaldo());
                achou = true;
                break;
            }else{
                break;
            }
        }
        if(achou){
            System.out.println("Número da conta não encontrado ou inexistente.");
        }
    }
    
    public void sacConta(String num, float valor){
        boolean achou = false;
        for (Conta c : listaContas) {
            if(c.getNome().equalsIgnoreCase(num)){
                c.sacar(valor);
                System.out.println("Saque realizado!");
                System.out.println("Saldo da conta: R$"+c.getSaldo());
                achou = true;
                break;
            }else{
                break;
            }
        }
        if(achou){
            System.out.println("Número da conta não encontrado ou inexistente.");
        }
    }
}
