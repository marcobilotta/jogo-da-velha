package bilotta.jogodavelha;

import javax.swing.JLabel;

/**
 * @date - 18/09/2022
 * @author - Marco Aurélio Bilotta e Luiz Eduardo Bilotta
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
