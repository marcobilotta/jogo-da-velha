/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilotta.jogodavelha;

import javax.swing.JLabel;

/**
 *
 * @author marco
 */
public class CampoTabuleiro extends JLabel{
    
    public static final int _LARGURA = 120;
    public static final int _ALTURA = 120;
    private char simbolo;
        
    private char getSimbolo(){
        return this.simbolo;
    }

    private void setSimbolo(char simbolo){
        this.simbolo = simbolo;
    }
    
    
}
