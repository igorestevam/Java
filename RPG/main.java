/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpg;

/**
 *
 * @author alunodev10
 */
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Inimigo> inimigos;
        Inimigo goblin = new Inimigo("facil", "Goblin", 15, 2, 7, 2, 1, 10);
        Inimigo lobo = new Inimigo("facil", "Lobo", 13, 3, 7, 2, 1, 10);
        Inimigo slime = new Inimigo("facil", "Slime", 10, 4, 7, 2, 1, 10);
        Inimigo ogro = new Inimigo("medio", "Ogro", 25, 6, 10, 4, 2, 20);
        Inimigo esqueleto = new Inimigo("medio", "Esqueleto", 22, 8, 10, 4, 2, 20);
        Inimigo fantasma = new Inimigo("medio", "Fantasma", 19, 7, 10, 4, 2, 20);
        
    }
}
