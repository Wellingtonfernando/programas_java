package testeconta;
import java.util.Scanner;
import org.me.exemploconta.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner leia = new Scanner (System.in);
        
        double novo_saldo;
        
        System.out.println("Informe o saldo: ");
        novo_saldo = leia.nextDouble();
        
        
        
        c.setSaldo(novo_saldo); //altera o valor do atributo saldo
        System.out.println("Saldo: " + c.getSaldo()); //retorna o atributo saldo
        
        
        //c.exibeSaldo(novo_saldo);
    }
    
}
