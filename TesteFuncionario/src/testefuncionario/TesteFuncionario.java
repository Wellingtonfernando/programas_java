package testefuncionario;

import java.util.Scanner;
import org.me.exemplofuncionario.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
      Funcionario F = new Funcionario();
      Scanner leia = new Scanner (System.in);
      
      String novo_nome;
      int nova_idade;
      double novo_salario;
      
      System.out.println("Informe sue nome: ");
      novo_nome = leia.nextLine(); //chama o metodo set e altera o atributo nome da classe funcionario
      
      System.out.println("Informe sua idade: ");
      nova_idade = leia.nextInt();
      
      System.out.println("Informe sue salario: ");
      novo_salario = leia.nextDouble();
      
      
      F.setNome(novo_nome);
      F.setIdade(nova_idade);
      F.setSalario(novo_salario);
      
      
      // System.out.printf("Nome %s: ", f.getNome());
      //como utilizar o printf
       
       
      System.out.println("Nome: " + F.getNome());
      System.out.println("Idade: " + F.getIdade());
      System.out.println("Salario: " + F.getSalario());
      
      
    }
    
}
