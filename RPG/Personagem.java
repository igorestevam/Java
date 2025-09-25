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
    private int nivel;
    private String nome;
    private String classe;
    private int vida;
    private int dano;
    private float atqPorTurno;
    private int mana;
    private int energia;
    private int moeda;
    
    // Igor Esteve aqui
    public Personagem(String nivel, String nome, String classe) {
        this.nivel = 1;
        this.nome = nome;
        this.classe = classe;
        this.moeda = 10;
        if(classe.equalsIgnoreCase("mago")){
            this.vida = 20;
            this.dano = 15;
            this.atqPorTurno = 1.0f;
            this.mana = 60;
            this.energia = 80;
        }
        if(classe.equalsIgnoreCase("guerreiro")){
            this.vida = 50;
            this.dano = 10;
            this.atqPorTurno = 1.2f;
            this.mana = 20;
            this.energia = 120;
        }
        if(classe.equalsIgnoreCase("ladino")){
            this.vida = 30;
            this.dano = 5;
            this.atqPorTurno = 1.5f;
            this.mana = 50;
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

    public int getEnergia() {
        return energia;
    }

    public int getMoeda() {
        return moeda;
    }

    public void getMana(int mana) {
        this.mana = mana;
    }
    
    public void setClasse(String classe){
        this.classe = classe;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    
    
}
