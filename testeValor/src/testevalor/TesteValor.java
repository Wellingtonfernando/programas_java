package testevalor;

import java.util.Scanner;
import org.me.exerciciovalor.Valor;

public class TesteValor {

    public static void main(String[] args) {
       Valor v = new Valor();
       Scanner leia = new Scanner (System.in);
       
       int novo_numero;
       
      for (int i = 0;i < 3;i++ )
      {
          System.out.printf("Digite o numero: ");
          novo_numero = leia.nextInt();
          v.setNumero(novo_numero);
          novo_numero = novo_numero * 2;
          
          System.out.printf("dobro de num: %f",v.getNumero());
          
          
      }
      
      }
       
        
    }
