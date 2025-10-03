/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpg;

/**
 *
 * @author alunodev10
 */
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Instanciando inimigos fáceis.
        Inimigo goblin = new Inimigo("facil", "Goblin", 40, 2);
        Inimigo lobo = new Inimigo("facil", "Lobo", 46, 3);
        Inimigo slime = new Inimigo("facil", "Slime", 50, 3);
        //Instanciando inimigos médios.
        Inimigo ogro = new Inimigo("medio", "Ogro", 79, 6);
        Inimigo esqueleto = new Inimigo("medio", "Esqueleto", 97, 8);
        Inimigo fantasma = new Inimigo("medio", "Fantasma", 128, 7);
        //Instanciando inimigos difíceis.
        Inimigo vampiro = new Inimigo("dificil", "Vampiro", 180, 12);
        Inimigo dragao = new Inimigo("dificil", "Dragao", 243, 12);
        Inimigo minotauro = new Inimigo("dificil", "Minotauro", 300, 10);
        //Instanciando O BOSS...
        Inimigo cthulhu  = new Inimigo("boss", "Cthulhu", 500, 15);
        
        //Adicionando inimigos à lista
        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(goblin);
        inimigos.add(lobo);
        inimigos.add(slime);
        inimigos.add(ogro);
        inimigos.add(esqueleto);
        inimigos.add(fantasma);
        inimigos.add(vampiro);
        inimigos.add(dragao);
        inimigos.add(minotauro);
        
        //Instanciando Recuperação.
        Recuperacao r = new Recuperacao();
        
        //Instanciando Batalha
        Batalha b = new Batalha();
        
        //Perguntando, instanciando e printando informações do jogador.
        System.out.print("Escolha o seu nick: ");
        String nick = scanner.nextLine();
        
        System.out.print("Escolha a sua classe(Guerreiro, Arqueiro e Ladino): ");
        String menu = scanner.nextLine();
        
        Personagem p = new Personagem(nick, menu);
        
        System.out.println("\nNick: "+p.getNome());
        System.out.println("Classe: "+p.getClasse());
        System.out.printf("Vida: %d/%d\n",p.getVidaAtual(),p.getVidaMax());
        System.out.printf("Energia: %d/%d\n",p.getEnergiaAtual(),p.getEnergiaMax());
        System.out.println("Dano: "+p.getDano());
        System.out.println("Moeda: "+p.getMoeda());
        System.out.println("Arma: "+p.getArmaNome());
        
        scanner.nextLine();
        //Iniciando Jornada
        for (int i = 0; i < inimigos.size(); i++) {
            System.out.println((i + 1)+"º inimigo: "+inimigos.get(i).getNome());
            //Batalha
            b.luta(p,inimigos.get(i));
            if(p.getVidaAtual() == 0){
                break;
            }else{
                System.out.println("\nSeus Status: ");
                System.out.println("\nNick: "+p.getNome());
                System.out.println("Classe: "+p.getClasse());
                System.out.printf("Vida: %d/%d\n",p.getVidaAtual(),p.getVidaMax());
                System.out.printf("Energia: %d/%d\n",p.getEnergiaAtual(),p.getEnergiaMax());
                System.out.println("Dano: "+p.getDano());
                System.out.println("Moeda: "+p.getMoeda());
                System.out.println("Arma:"+p.getArmaNome());
                
                //Deseja recuperar
                System.out.println("\nVocê deseja: ");
                System.out.println("[1] -10 moedas Comer pernil (+15hp e +30energ).");
                System.out.println("[2] -20 moedas Passar a noite na taberna (recuperação total).");
                System.out.println("[qualquer outra tecla] Continuar a jornada.");
                int opt = scanner.nextInt();
                scanner.nextLine();
                r.recuperarJogador(opt, p);
            }
        }
        if(p.getVidaAtual() > 0){
            b.lutaFinal(p,cthulhu);
            System.out.println("Fim do jogo! Você venceu!");
        }else{
            System.out.println("Fim de jogo! Você perdeu!");
        }
        scanner.close();
    }
}
