/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecurso;

import java.util.Scanner;
import org.me.exemplometodo.Curso;

/**
 *
 * @author Desenvolvedor
 */
public class TesteCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso linguagem = new Curso();
        Scanner leia = new Scanner(System.in);
        String nomecurso;
        System.out.println("Nome do Curso: ");
        nomecurso = leia.nextLine();
        linguagem.exibeMensagem(nomecurso);
        
    }
    
}
