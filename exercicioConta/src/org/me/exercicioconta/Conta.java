
package org.me.exercicioconta;

public class Conta {
    private float saldo;
    
    
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    public Conta (float saldo){
        this.saldo = saldo;
    }
   public  void credito (float saldo){
        this.saldo += saldo;  
    }
    public void debito (float saldo){
        
        this.saldo -= saldo;
    }
}
