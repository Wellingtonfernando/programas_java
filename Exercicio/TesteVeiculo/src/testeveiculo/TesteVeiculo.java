/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeveiculo;

import org.me.exemploveiculo.Veiculo;

/**
 *
 * @author Desenvolvedor
 */
public class TesteVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v1 = new Veiculo();
        v1.modelo = "Fusca";
        v1.ano = 2017;
        v1.cor = "Amarelo";
        v1.valor = 80000.00;
        System.out.println("Hello World!");
        System.out.println("Modelo: "+ v1.modelo);            
        System.out.println("Cor: "+ v1.cor);
        System.out.println("Ano: "+ v1.ano);
        System.out.println("Valor : "+ v1.valor);
    }
    
}
