
package org.me.exercicioproduto;

public class Produto {
    private String descricao;
    private int quantidade;
    private double preco;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    public void conta (){
        float mult,tot;
        mult = (float) (quantidade * preco);
        
        if (mult >= 100)
        {
            tot = (float) (mult - (mult * 0.10)) ;
            System.out.printf("total: %.2f\n",tot);
        }
        else
        {
            tot = (float) (mult - (mult * 0.05));
            System.out.printf("total: %.2f\n",tot);
        }
    }
}
