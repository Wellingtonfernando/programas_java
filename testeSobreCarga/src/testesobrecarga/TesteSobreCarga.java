package testesobrecarga;

import org.me.exemplosobrecarga.sobrecarga;

public class TesteSobreCarga {
    public static void main(String[] args) {
       sobrecarga s = new sobrecarga ();
       s.exibemensagem("aula");
       s.exibemensagem();
       s.exibemensagem(100);
    }
    
}
