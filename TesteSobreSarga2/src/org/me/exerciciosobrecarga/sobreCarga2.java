package org.me.exerciciosobrecarga;
public class sobreCarga2 {
    private int a,b,c;   
    public void valor(int n1, int n2, int n3){
        a =  n1 + n2 + n3;
        b = 0;
        c = 0;
    }
    public void valor(int n1){
        a = 0;
        b = n1;
        c = 0;
    }
    public void valor(int n1, int n2){
        a = 0;
        b = 0;
        c = n1 * n2;
    }
    public void imprimeValor (){
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.printf("\n");
    }
    
}
