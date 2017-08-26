package testesobresarga2;
import org.me.exerciciosobrecarga.sobreCarga2;
public class TesteSobreSarga2 {

    public static void main(String[] args) {
        sobreCarga2 sb1 = new sobreCarga2();
        sobreCarga2 sb2 = new sobreCarga2();
        
        System.out.println("primeira instancia");
        sb1.valor(3, 4, 5);
        sb1.imprimeValor();
        
        sb1.valor(4);
        sb1.imprimeValor();
        
        sb1.valor(5, 6);
        sb1.imprimeValor();
        
        System.out.println("\nsegunda instancia");
        sb2.valor(10, 4, 5);
        sb2.imprimeValor();
        
        sb2.valor(20);
        sb2.imprimeValor();
        
        sb2.valor(15, 6);
        sb2.imprimeValor();     
    }
}
