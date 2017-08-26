
package org.me.exercicioescola;
public class Escola {
   private String nome,RA;
   private int creditos;

   public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public int getCreditos() {
        return creditos;
    }  
    
    public Escola (String nome, String RA, int creditos){
        this.nome = nome;
        this.RA = RA;
        this.creditos = creditos;
    }
    
    public void contaCreditos (int creditos){
        this.creditos += creditos;
    }
   
}
