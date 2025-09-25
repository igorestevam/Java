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
        
        while (true) {  
            
        System.out.println("\nMenu:");
        System.out.println("Opção 1: Adicionar conta.");
        System.out.println("Opção 2: Consultar conta.");
        System.out.println("Opção 3: Remover conta.");
        System.out.println("Opção 4: Realizar transação entre contas.");
        System.out.println("Opção 5: Depositar quantia.");
        System.out.println("Opção 6: Sacar quantia.");
        System.out.println("Qualquer outro número: Fechar programa.");
                  
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch(menu){
                case 1:
                    System.out.println("\nInforme os dados da conta: ");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número da conta: ");
                    String num = scanner.nextLine();
                    System.out.print("Agência: ");
                    String agencia = scanner.nextLine();                 
                    Conta c = new Conta(nome, num, agencia);
                    b.addConta(c);
                    System.out.println("\nUsuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nInforme o número da conta a ser consultada: ");
                    String num1 = scanner.next();
                    b.consultarConta(num1);
                    break;
                case 3:
                    System.out.println("\nInforme o número da conta a ser removida: ");
                    String num2 = scanner.next();
                    b.removeConta(num2);
                    break;
                case 4:
                    System.out.println("\nNúmero da conta que irá transferir: ");
                    String num3 = scanner.next();
                    System.out.println("Valor a ser transferido: ");
                    float valor = scanner.nextFloat();
                    System.out.println("Número da conta que irá receber: ");
                    String num4 = scanner.next();
                    b.transacaoContas(num3, num4, valor);
                    break;
                case 5:
                    System.out.println("\nNúmero da conta para depositar: ");
                    String num5 = scanner.next();
                    System.out.println("Valor a ser depositado: ");
                    valor = scanner.nextFloat();
                    b.depConta(num5, valor);
                    break;
                case 6:
                    System.out.println("\nNúmero da conta para sacar: ");
                    String num6 = scanner.next();
                    System.out.println("Valor a ser sacado: ");
                    valor = scanner.nextFloat();
                    b.sacConta(num6, valor);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}


