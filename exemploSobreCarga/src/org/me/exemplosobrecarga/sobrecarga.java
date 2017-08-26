package org.me.exemplosobrecarga;
public class sobrecarga {
    public void exibemensagem(){
        System.out.println("nada foi informado");
    }
    public void exibemensagem(int x){
        System.out.println("o numero informado %d"+ x);
    }
    
    public void exibemensagem (String txt){
        System.out.println("o texto informado é %s" + txt);
    }
}
