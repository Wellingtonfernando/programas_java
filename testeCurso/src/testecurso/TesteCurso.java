package testecurso;

import org.me.exemploconstrutor.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso c = new Curso("java","João",20, (float) 300.00);
        Curso c2 = new Curso ("Python","Ana",35, (float) 450.00);
        System.out.println("Nome do curso: " + c.getNomecurso());
        
       // c.setIdade(18);
       // c.setNomecurso("Python");
       // System.out.println("Idade: " + c.getIdade());
       //System.out.println("Nome do curso: " + c.getNomecurso());
       
        System.out.println("Nome do funcionario: " + c.getNome());
        System.out.println("Idade do funcionario: " + c.getIdade());
        System.out.println("salario do funcionario: " + c.getSalario());
        
        System.out.println("\nNome do curso: " + c2.getNomecurso());
        System.out.println("Nome do funcionario: " + c2.getNome());
        System.out.println("Idade do funcionario: " + c2.getIdade());
        System.out.println("salario do funcionario: " + c2.getSalario());
       
    }
    
}
