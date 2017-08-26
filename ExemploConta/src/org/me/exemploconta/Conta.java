
package org.me.exemploconta;


public class Conta {
    public String nome; //atributos, caracteristicas
    public int agencia;
    private double saldo;
    
    public void exibeSaldo(double sal){
        System.out.println("Saldo: " + sal);
        
            
    }
    public void setSaldo(double s ){
        saldo = s;
    }
    public double getSaldo(){
        return saldo;
    }
}
