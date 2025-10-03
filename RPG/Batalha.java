/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author IGOR
 */
import java.util.Scanner;
public class Batalha {
    Scanner scanner = new Scanner(System.in);
    public void luta(Personagem p, Inimigo i){
        while(true){
            scanner.nextLine();
            if(p.getVidaAtual() > 0 && i.getVida() > 0){
                atacar(p);
                receberDanoInimigo(p,i);
                System.out.printf("\nVocê causou %d de dano\n",p.getDano());
                System.out.println("\nStatus do inimigo: ");
                System.out.println("Nome: "+i.getNome());
                System.out.println("Vida: "+ i.getVida());
                scanner.nextLine();
            }
            if(p.getVidaAtual() > 0 && i.getVida() > 0){
                receberDanoPersonagem(p,i);
                System.out.printf("\nVocê tomou %d de dano\n",i.getDano());
                System.out.println("\nSeus Status: ");
                System.out.println("Nick: "+p.getNome());
                System.out.printf("Vida: %d/%d\n",p.getVidaAtual(),p.getVidaMax());
                System.out.printf("Energia: %d/%d\n",p.getEnergiaAtual(),p.getEnergiaMax());   
                scanner.nextLine();
            }
            if(p.getVidaAtual() == 0 || p.getEnergiaAtual() == 0){
                System.out.println("\nVocê morreu!");
                break;
            }
            if(i.getVida() == 0){
                System.out.println("\nParabéns você venceu essa batalha!");
                p.setVidaMax(p.getVidaMax() + i.getBuffVida());
                p.setVidaAtual(p.getVidaAtual() + i.getBuffVida());
                p.setEnergiaMax(p.getEnergiaMax() + i.getBuffEnergia());
                p.setEnergiaAtual(p.getEnergiaAtual() + i.getBuffEnergia());
                p.setDano(p.getDano() + i.getBuffDano());
                p.setMoeda(p.getMoeda() + i.getRecompensa());
                scanner.nextLine();
                break;
            }
        }  
    }
    
    public void lutaFinal(Personagem p, Inimigo i){
        while(true){
            scanner.nextLine();
            if(p.getVidaAtual() > 0 && i.getVida() > 0){
                atacar(p);
                receberDanoInimigo(p,i);
                System.out.printf("\nVocê causou %d de dano\n",p.getDano());
                System.out.println("\nStatus do inimigo: ");
                System.out.println("Nome: "+i.getNome());
                System.out.println("Vida: "+ i.getVida());
                scanner.nextLine();
            }
            if(p.getVidaAtual() > 0 && i.getVida() > 0){
                receberDanoPersonagem(p,i);
                System.out.printf("\nVocê tomou %d de dano\n",i.getDano());
                System.out.println("\nSeus Status: ");
                System.out.println("Nick: "+p.getNome());
                System.out.printf("Vida: %d/%d\n",p.getVidaAtual(),p.getVidaMax());
                System.out.printf("Energia: %d/%d\n",p.getEnergiaAtual(),p.getEnergiaMax());   
                scanner.nextLine();
            }
            if(p.getVidaAtual() == 0 || p.getEnergiaAtual() == 0){
                System.out.println("\nVocê morreu!");
                break;
            }
            if(i.getVida() == 0){
                System.out.println("\nParabéns você venceu o Cthulhu.");
                break;
            }
        }
    }
    
    public void atacar(Personagem p){
        p.setEnergiaAtual(p.getEnergiaAtual()-10);
        if(p.getEnergiaAtual() < 0){
            p.setEnergiaAtual(0);
        }
        
    }
    
    public void receberDanoInimigo(Personagem p, Inimigo i){
        i.setVida(i.getVida() - p.getDano());
        if(i.getVida() < 0){
            i.setVida(0);
        }
    }
    
    public void receberDanoPersonagem(Personagem p, Inimigo i){
        p.setVidaAtual(p.getVidaAtual() - i.getDano());
        if(p.getVidaAtual() < 0){
            p.setVidaAtual(0);
        }
    }
}
