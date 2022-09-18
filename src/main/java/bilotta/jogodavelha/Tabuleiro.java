package bilotta.jogodavelha;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author marco
 */
public class Tabuleiro extends JLabel{
    
    private static final int _LARGURA = 400;
    private static final int _ALTURA = 400;
    private static final int _POSICAO_X = 140;
    private static final int _POSICAO_Y = 25;
    private static final String _TABULEIRO = "C:\\Users\\marco\\GitHub\\Projetos\\jogo-da-velha\\src\\main\\java\\bilotta\\images\\tabuleiroColorido400x400.png";
    
    private CampoTabuleiro campoTabuleiro;
    
    public Tabuleiro(){
        definirTamanho();
        definirImagemFundo();
    } 
    
    private void definirTamanho(){
        this.setBounds(_POSICAO_X, _POSICAO_Y, _LARGURA, _ALTURA);
    }    
    
    private void definirImagemFundo(){
        Icon imagemFundo = new ImageIcon(_TABULEIRO);
        this.setIcon(imagemFundo);
    }
    
    public List<CampoTabuleiro> criarCamposTabuleiro(){
        List<CampoTabuleiro> camposTabuleiro = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            campoTabuleiro = new CampoTabuleiro();
            campoTabuleiro.setBounds(140, 25, CampoTabuleiro._LARGURA, CampoTabuleiro._ALTURA);
            camposTabuleiro.add(campoTabuleiro);
        }
        return camposTabuleiro;
    }
}
