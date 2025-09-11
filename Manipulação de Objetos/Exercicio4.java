//Classe Carro

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author IGOR
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    
    public Carro(String marca, String modelo, int ano, double velocidade){
        this.marca = marca;
        this. modelo = modelo;
        this.ano = ano;
        this. velocidade = velocidade;
    }
    
    public double acelerar(double acelera){
        velocidade += acelera;
        return velocidade;
    }
    
    public double frear(double freia){
        velocidade -= freia;
        return velocidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
}

//main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Renault", "Kwid", 2018, 80);
        c1.acelerar(80);
        c1.frear(40);
        c1.acelerar(90);
        c1.frear(30);
        
        Carro c2 = new Carro("Fiat", "500", 2007, 180);
        c2.acelerar(100);
        c2.frear(60);
        c2.acelerar(20);
        c2.frear(30);
        
        System.out.printf("Velociade do 1º carro: %.2f\n",c1.getVelocidade());
        System.out.printf("Velociade do 2º carro: %.2f\n",c2.getVelocidade());
        
        if(c1.getVelocidade() >= c2.getVelocidade()){
            System.out.println("O 1º carro foi o vencedor!");
        }else{
            System.out.println("O 2º carro foi o vencedor!");
        }
    }
    
}
