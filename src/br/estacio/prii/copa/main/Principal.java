package br.estacio.prii.copa.main;


import br.estacio.prii.copa.gui.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main (String args[]){
        
        FrameSplash splash = new FrameSplash();
        splash.setVisible(true);
        
        try{
            for(int i = 0; i <= 100; i++){
                Thread.sleep(40);
                splash.lblPorcentagemCarregando.setText(Integer.toString(i)+ "%");
                FrameLogin login = new FrameLogin();
                if(i == 100){
                    splash.dispose();
                    login.show();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
