
package testesobrecarga_1;

import java.util.Scanner;
import org.me.exercicosobrecarga.ExercicioSobreCarga;

public class TesteSobreCarga_1 {

    public static void main(String[] args) {
        ExercicioSobreCarga sb = new ExercicioSobreCarga();
        Scanner leia = new Scanner (System.in);
        
        System.out.println("digite o valor a ser dividido por 2: ");
        sb.calcula(leia.nextInt());
       
        System.out.println("digite os quatro valoresa serem somados");
        sb.calcula(leia.nextInt(),leia.nextInt(),leia.nextInt(),leia.nextInt());
        
        System.out.println("digite os dois valores a serem subtraidos: ");
        sb.calcula(leia.nextInt(),leia.nextInt());
        
        System.out.println("digite os três valores a serem multiplicados: ");
        sb.calcula(leia.nextInt(),leia.nextInt(),leia.nextInt());
               
    }
    
}
