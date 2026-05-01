/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author RTX4060
 */
public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private int fase;
    
    public Aluno (){
        this("",0,"",0);
                
    }
    public Aluno(String nome,int idade, String curso,int fase){
            this.nome=nome;
            this.idade=idade;
            this.curso=curso;
            this.fase=fase;
            
            
}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public int getFase() {
        return fase;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
}