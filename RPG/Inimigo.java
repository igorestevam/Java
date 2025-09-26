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

    public Inimigo(String dif, String nome, int vida, int dano, int recompensa, int buffVida, int buffDano, int buffEnergia) {
        this.dif = dif;
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.recompensa = recompensa;
        this.buffVida = buffVida;
        this.buffDano = buffDano;
        this.buffEnergia = buffEnergia;
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
    
    
}
