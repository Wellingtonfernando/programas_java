/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecliente;

import org.me.excliente.Cliente;

/**
 *
 * @author Desenvolvedor
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.email = "joaoemeil@gmail.com";
        c1.nome = "João";
        c1.telefone = "99999999";
        
        Cliente c2 = new Cliente();
        c2.email = "anaemail2017@gmail.com";
        c2.nome = "Ana";
        c2.telefone = "9929292929";
        
        System.out.println("Nome: " + c1.nome);
        System.out.println("Email: " + c1.email);
        System.out.println("Telefone: " + c1.telefone + "\n");
        System.out.println("Nome: " + c2.nome);
        System.out.println("Email: " + c2.email);
        System.out.println("Telefone: " + c2.telefone);
    }
    
}
