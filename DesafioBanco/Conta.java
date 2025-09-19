/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiobanco;

/**
 *
 * @author alunolab10
 */
public class Conta {
    
    private String nome;
    private String num;
    private float saldo;
    private String agencia;
    
    public Conta(String nome, String num, String agencia){
        this.nome = nome;
        this.num = num;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public String getNum() {
        return num;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }
    
    public float depositar(float valor){
        if(valor > 0){
            saldo += valor;
            return saldo;
        }else{
            System.out.println("Não é possível depositar um valor nulo ou negativo.");
            return saldo;
        }
    }
    
    public float sacar(float valor){
        if (saldo < valor){
            if(valor > 0){
                saldo -= valor;
                System.out.print("Saldo atual: ");
                return saldo;
            }else{
                System.out.println("Não é possível sacar um valor nulo ou negativo.");
                System.out.print("Saldo atual: ");
                return saldo;
            }
        }else{
            System.out.println("Saldo insuficiente.");
            System.out.print("Saldo atual: ");
            return saldo;
        }
        
    }
    
}
