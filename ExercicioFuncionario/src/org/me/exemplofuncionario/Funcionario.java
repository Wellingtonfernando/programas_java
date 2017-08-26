package org.me.exemplofuncionario;
public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    
    
    public void setNome(String n){
        nome = n;
    }
    public void setIdade(int i){
        idade = i;
    }
    public void setSalario(double sal){
        salario = sal;
    }
    
    
    public String getNome (){
        return nome;
    }
    public int getIdade (){
        return idade;
    }
    public double getSalario (){
        return salario;
    }
}
