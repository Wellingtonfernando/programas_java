
package testeproduto;

import java.util.Scanner;
import org.me.exercicioproduto.Produto;

public class TesteProduto {

    public static void main(String[] args) {
        Produto p = new Produto();
        Scanner leia = new Scanner (System.in);
        
        String novo_descricao;
        int novo_quantidade;
        double novo_preco;
        
        System.out.printf("Digite a Descrição do produto: ");
        novo_descricao = leia.nextLine();
        p.setDescricao(novo_descricao);
        
        System.out.printf("Digite a Quantidade de produtos: ");
        novo_quantidade = leia.nextInt();
        p.setQuantidade(novo_quantidade);
        
         System.out.printf("Digite o Preço do produto: ");
         novo_preco = leia.nextDouble();
         p.setPreco(novo_preco);
        
         System.out.printf("Descrição do produto: %s\n", p.getDescricao());
         System.out.printf("Quantidade de produtos: %d\n",p.getQuantidade());
         System.out.printf("Valor do produto: %.2f\n",p.getPreco());
                 
         p.conta();
    }
    
}
