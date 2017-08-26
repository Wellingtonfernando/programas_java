
package testconta;

import java.util.Scanner;
import org.me.exercicioconta.Conta;

public class TestConta {

    public static void main(String[] args) {
        Conta c1 = new Conta ((float) 1000.00);
        Conta c2 = new Conta ((float) 1000.00);
        Scanner leia = new Scanner (System.in);
        int  escolha_conta,escolha_c_d;
        
        float novo_saldo;
        
        System.out.println("Informe a conta desejada: 1 ou 2 ");
        escolha_conta = leia.nextInt();
        
        
        
        if (escolha_conta == 1)
        {
            System.out.printf("escolha a opção: 1 credito 2 debito ");
            escolha_c_d = leia.nextInt();
            if (escolha_c_d == 1)
            {
                System.out.print("Informe o valor creditado: ");
                novo_saldo = leia.nextFloat();
                c1.credito(novo_saldo);
                System.out.printf("Conta 1 saldo total: %f", c1.getSaldo());
                System.out.printf("\nConta 2 saldo total: %f\n", c2.getSaldo());
                
            }
            else
            {
                System.out.printf("Informe o valor de debito "); 
                novo_saldo = leia.nextFloat();
                c1.debito(novo_saldo);
                System.out.printf("Conta 1 saldo total: %f", c1.getSaldo());
                System.out.printf("\nConta 2 saldo total: %f\n", c2.getSaldo());
                
            }   
        }
        else if (escolha_conta == 2)
        {
            System.out.printf("escolha a opção: 1 credito 2 debito ");
            escolha_c_d = leia.nextInt();
            if (escolha_c_d == 1)
            {
                System.out.print("Informe o valor creditado: ");
                novo_saldo = leia.nextFloat();
                c2.credito(novo_saldo);
                System.out.printf("Conta 1 saldo total: %f", c1.getSaldo());
                System.out.printf("\nConta 2 saldo total: %f\n", c2.getSaldo());
            }
            else
            {
                System.out.printf("Informe o valor de debito "); 
                novo_saldo = leia.nextFloat();
                c2.debito(novo_saldo);
                System.out.printf("Conta 1 saldo total: %f", c1.getSaldo());
                System.out.printf("\nConta 2 saldo total: %f\n", c2.getSaldo());
            }
        }     
    }
}

