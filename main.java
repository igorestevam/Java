/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiobanco;

/**
 *
 * @author alunolab10
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco b = new Banco();
        
        System.out.println("Menu:");
        System.out.println("Opção 1: Adicionar conta.");
        System.out.println("Opção 2: Consultar conta.");
        System.out.println("Opção 3: Remover conta.");
        System.out.println("Opção ");
        System.out.println("Opção 0: Fechar programa.");
        
        int menu = scanner.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("\nInforme os dados da conta: ");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Número da conta: ");
                String num = scanner.nextLine();
                System.out.println("Agência: ");
                String agencia = scanner.nextLine();
                System.out.println("\nUsuário cadastrado com sucesso!");
                
                b.addConta();
                break;
            case 2:
                
        
        }
    }
}
