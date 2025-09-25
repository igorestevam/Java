/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author alunolab10
 */
import java.util.ArrayList;
public class Inimigo {
    private String nome;
    private int vida;
    private int dano;
    private float atqPorTurno;
    private int mana;
    private int recompensa;

    public Inimigo(String nome, int vida, int dano, float atqPorTurno, int mana, int recompensa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.atqPorTurno = atqPorTurno;
        this.mana = mana;
        this.recompensa = recompensa;
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

    public float getAtqPorTurno() {
        return atqPorTurno;
    }

    public int getMana() {
        return mana;
    }

    public int getRecompensa() {
        return recompensa;
    }
    
    
    
}
