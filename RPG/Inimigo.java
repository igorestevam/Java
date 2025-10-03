/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author alunolab10
 */
public class Inimigo {
    private String dif;
    private String nome;
    private int vida;
    private int dano;
    private int recompensa;
    private int buffVida;
    private int buffDano;
    private int buffEnergia;

    public Inimigo(String dif, String nome, int vida, int dano) {
        this.dif = dif;
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        switch (dif.toLowerCase()) {
            case "facil":
                this.recompensa = 4;
                this.buffVida = 2;
                this.buffDano = 1;
                this.buffEnergia = 10;
                break;
            
            case "medio":
                this.recompensa = 7;
                this.buffVida = 4;
                this.buffDano = 2;
                this.buffEnergia = 20;
                break;
            
            case "dificil":
                this.recompensa = 12;
                this.buffVida = 8;
                this.buffDano = 5;
                this.buffEnergia = 30;
                break;
                
            default:
                this.recompensa = 0;
                this.buffVida = 0;
                this.buffDano = 0;
                this.buffEnergia = 0;
                break;
        }
    }

    public String getDif(){
        return dif;
    }
    
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public int getBuffVida() {
        return buffVida;
    }
    
    public int getBuffDano() {
        return buffDano;
    }

    public int getBuffEnergia() {
        return buffEnergia;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    
    
}
