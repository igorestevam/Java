//Classe Calculadora

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

/**
 *
 * @author IGOR
 */
public class Calculadora {
    
    public static float somar(float n1, float n2){
        return n1 + n2;
    }
    
    public static float subtrair(float n1, float n2){
        return n1 - n2;
    }
    
    public static float multiplicar(float n1, float n2){
        return n1 * n2;
    }
    
    public static float dividir(float n1, float n2){
        if(n2 == 0){
            System.out.println("Não é possível dividir um número por zero!");
            return n1;
        }else{
            return n1 / n2;
        }
    }

//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        
        System.out.println(c.somar(4f,6f));
        System.out.println(c.subtrair(7f,8f));
        System.out.println(c.multiplicar(9f,9f));
        System.out.println(c.dividir(7f,0f));
        
    }
    
}
