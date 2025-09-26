/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author alunolab10
 */
public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int dano;
    private int atqPorTurno;
    private int energia;
    private int moeda;
    
    // Igor Esteve aqui
    public Personagem(String nivel, String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.moeda = 10;
        if(classe.equalsIgnoreCase("arqueiro")){
            this.vida = 30;
            this.dano = 8;
            this.atqPorTurno = 2;
            this.energia = 80;
        }
        if(classe.equalsIgnoreCase("guerreiro")){
            this.vida = 60;
            this.dano = 10;
            this.atqPorTurno = 1;
            this.energia = 120;
        }
        if(classe.equalsIgnoreCase("ladino")){
            this.vida = 45;
            this.dano = 15;
            this.atqPorTurno = 1;
            this.energia = 100;
        }else{
            System.out.println("Erro: escolha uma classe válida.");
        }
        
    }

    public String getNome() {
        return nome;
    }
    
    public String getClasse(){
        return classe;
    }

    public int getVida() {
        return vida;
    }
    
    public int dano() {
        return dano;
    }
    
    public int atqPorTurno() {
        return atqPorTurno;
    }

    public int getEnergia() {
        return energia;
    }

    public int getMoeda() {
        return moeda;
    }

}
