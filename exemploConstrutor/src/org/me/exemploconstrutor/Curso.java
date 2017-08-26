package org.me.exemploconstrutor;

public class Curso {
    private String nomecurso,nome;
    private int idade;
    private float salario;

   

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
     
    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
   
    public String getNomecurso() {
        return nomecurso;
    }
    
    public Curso(String nomecurso, String nome , int idade, float salario){
        this.nome = nome;
        this.nomecurso = nomecurso;
        this.idade = idade;
        this.salario = salario;
    }
      
   
} 

