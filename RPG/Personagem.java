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
    private int vidaMax;
    private int vidaAtual;
    private int dano;
    private int energiaMax;
    private int energiaAtual;
    private int moeda;
    private Item arma;
    
    //Instanciando itens.
    Item arco = new Item("Galadhrim", 7);
    Item espada = new Item("Excalibur", 5);
    Item adaga = new Item("Sonnet", 4);
    Item nada = new Item("Punho", 0);
    
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.moeda = 10;
        switch (classe.toLowerCase()) {
            case "arqueiro":
                this.vidaMax = 30;
                this.dano = 6;
                this.energiaMax = 120;
                this.arma = arco;
                break;

            case "guerreiro":
                this.vidaMax = 40;
                this.dano = 5;
                this.energiaMax = 100;
                this.arma = espada;
                break;

            case "ladino":
                this.vidaMax = 20;
                this.dano = 8;
                this.energiaMax = 100;
                this.arma = adaga;
                break;

            default:
                System.out.println("Erro: escolha uma classe válida.");
                this.vidaMax = 10;
                this.dano = 1;
                this.energiaMax = 50;
                this.arma = nada;
                break;
        }
        this.vidaAtual = vidaMax;
        this.energiaAtual = energiaMax;
    }

    public String getNome() {
        return nome;
    }
    
    public String getClasse(){
        return classe;
    }

    public int getVidaMax() {
        return vidaMax;
    }
    
    public int getVidaAtual(){
        return vidaAtual;
    }
    
    public int getDano() {
        return dano + getArmaDano();
    }

    public int getEnergiaMax(){
        return energiaMax;
    }
    
    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public int getMoeda() {
        return moeda;
    }

    public String getArmaNome() {
        return arma.getNomeItem();
    }
    
    public int getArmaDano(){
        return arma.getDanoItem();
    }

    public void setVidaAtual(int vida) {
        this.vidaAtual = vida;
    }
    
    public void setEnergiaAtual(int energia){
        this.energiaAtual = energia;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setEnergiaMax(int energiaMax) {
        this.energiaMax = energiaMax;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }
    
    
}
