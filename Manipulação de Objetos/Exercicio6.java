//Classe Aluno

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author alunolab10
 */
public class Retangulo {
    
    private float largura;
    private float altura;
    
    public Retangulo(float largura, float altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public float calcularArea(){
        float area = largura * altura;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = 2 * largura + 2 * altura;
        return perimetro;
    }
    
}

//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author alunolab10
 */
public class main {
    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo(2.3f,2.0f);
        Retangulo r2 = new Retangulo(5.1f,3.0f);
        
        System.out.printf("Área do 1º retângulo: %.2f\n",r1.calcularArea());
        System.out.printf("Área do 2º retângulo: %.2f\n",r2.calcularArea());
        
        if(r1.calcularArea() > r2.calcularArea()){
            System.out.println("Área do primeiro retângulo é maior;");
        }else{
            System.out.println("Área do segundo retângulo é maior;");
        }
        
    }    
}
