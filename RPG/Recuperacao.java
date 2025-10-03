/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author IGOR
 */
public class Recuperacao {
   
    public void recuperarJogador(int optRec,Personagem p){
        switch(optRec){
            case 1:
                if(p.getVidaAtual() + 15 > p.getVidaMax()){
                    p.setVidaAtual(p.getVidaMax());
                }else{
                    p.setVidaAtual(p.getVidaAtual() + 15);
                }
                if(p.getEnergiaAtual() + 30 > p.getEnergiaMax()){
                    p.setEnergiaAtual(p.getEnergiaMax());
                }else{
                    p.setEnergiaAtual(p.getEnergiaAtual() + 30);
                }
                p.setMoeda(p.getMoeda() - 10);
                System.out.println("-10 moedas");
                System.out.println("Você recebeu +15 de vida e +30 de energia!");
                break;
            case 2:
                p.setVidaAtual(p.getVidaMax());
                p.setEnergiaAtual(p.getEnergiaMax());
                p.setMoeda(p.getMoeda() - 20);
                System.out.println("-20 moedas");
                System.out.println("Você restaurou completamente a sua vida e energia!");
                break;
            default:
                System.out.println("Você optou por continuar a jornada.");
                break;
        }
    }
}
