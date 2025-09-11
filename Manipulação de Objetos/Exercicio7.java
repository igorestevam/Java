//Classe Livros

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author IGOR
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public boolean isDisponivel(){
        return disponivel;
    }
    
    public void emprestar(){
        this.disponivel = false;
    }
    
    public void devolver(){
        this.disponivel = true;
    }
}


//Classe Biblioteca

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author IGOR
 */

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    private List<Livro> livros;
    
    public Biblioteca(){
        livros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public boolean emprestarLivro(String titulo){
        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo) && l.isDisponivel()){
                l.emprestar();
                return true;
            }
        }
        return false;
    }
    
    public boolean devolverLivro(String titulo){
        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo) && !l.isDisponivel()){
                l.devolver();
                return true;
            }
        }
        return false;
    }
    
    public void listarLivros(){
        for(Livro l : livros){
            if(l.isDisponivel()){
                System.out.println(l.getTitulo()+", por: "+l.getAutor());
            }
        }
    }
    
}


//Classe main

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

/**
 *
 * @author IGOR
 */
public class main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        
        bib.adicionarLivro(new Livro("O Hobbit", "J.R.R. Tolkien", true));
        bib.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true));
        bib.adicionarLivro(new Livro("O Manifesto Comunista", "Karl Marx", true));
        
        bib.listarLivros();
        bib.emprestarLivro("O Hobbit");
        bib.listarLivros();
        bib.devolverLivro("O Hobbit");
        bib.listarLivros();
    }
}
