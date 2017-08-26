
package testeescola;

import java.util.Scanner;
import org.me.exercicioescola.Escola;

public class TesteEscola {
    public static void main(String[] args) {
        Escola e = new Escola ("maria","123456789",200);
        Scanner leia = new Scanner (System.in);
        int resp;
        
        int novo_credito = 0;
        
        System.out.println("nome: " + e.getNome());
        System.out.println("RA: " + e.getRA());
        System.out.println("créditos: " + e.getCreditos());
        
        System.out.println("deseja aplicar seus créditos ???");
        System.out.println("0 sim  1 não");
        resp = leia.nextInt();
        while(resp == 0)
        {            
            System.out.println("Digite o valor que deseja aplicar: ");
            novo_credito = leia.nextInt();
           
            e.contaCreditos(novo_credito);
                
            System.out.println("Novo credito: " + e.getCreditos());
            if (novo_credito >= 0){
                System.out.println("deseja continuar aplicando seus créditos ???");
                System.out.println("0 sim  1 não");
                resp = leia.nextInt();
            }
            else {
                System.out.println("seus creditos acabaram");
            }    
        }
        
    }
        
}

