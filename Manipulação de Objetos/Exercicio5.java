//Classe Aluno

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

/**
 *
 * @author alunolab10
 */
public class Aluno {
    
    String nome;
    private float[] listaNotas;
    
    public Aluno(String nome, float[] listaNotas){
        this.nome = nome;
        this.listaNotas = listaNotas;
    }
    
    public float calcularMedia(){
        float soma = 0;
        for(float nota : listaNotas){
            soma += nota;
        }
        return soma/2;
    }
    
    public boolean aprovacao(){
        float media = calcularMedia();
        if(media >= 7){
            return true;
        }else{
            return false;
        }
    }
    
    public float[] getListaNotas(){
        return listaNotas;
    }
    
    public void exibirResultado(){
        float media = calcularMedia();
        System.out.println("Aluno: "+nome);
        System.out.println("Média: "+media);
        if(aprovacao()){
            System.out.println("Status: Aprovado\n");
        }else{
            System.out.println("Status: Reprovado\n");
        }
    }
}

//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

/**
 *
 * @author alunolab10
 */
public class main {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Lucas", new float[]{7.5f, 8.1f});
        Aluno a2 = new Aluno("Cauan", new float[]{9.0f, 7.6f});
        Aluno a3 = new Aluno("Bahia", new float[]{7.8f, 8.8f});
        
        a1.exibirResultado();
        a2.exibirResultado();
        a3.exibirResultado();
    }
}
