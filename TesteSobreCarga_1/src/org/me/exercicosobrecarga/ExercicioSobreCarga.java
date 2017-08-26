package org.me.exercicosobrecarga;
public class ExercicioSobreCarga {
    private int resultado;
    
    public void calcula(int n1){
        System.out.printf("%d valor dividido 2 eh: %d\n", n1, (n1/2));
    }
    
    public void calcula(int a, int b, int c, int d){
        resultado = a+b+c+d;
        System.out.printf("a soma de %d + %d + %d + %d eh: %d\n", a,b,c,d,resultado);
    }
    public void calcula(int a, int b){
        resultado = a-b;
        System.out.printf("%d dividido por %d eh: %d\n", a,b,resultado);
    }
    public void calcula (int a, int b, int c ){
        resultado = a * b * c;
        System.out.printf("%d * %d * %d eh: %d\n" ,a,b,c,resultado);
    }   
}
