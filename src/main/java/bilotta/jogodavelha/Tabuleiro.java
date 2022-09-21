package bilotta.jogodavelha;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @date - 18/09/2022
 * @author - Marco Aurélio Bilotta e Luiz Eduardo Bilotta
 */
public class Tabuleiro extends JLabel{
    
    private static final int _LARGURA = 400;
    private static final int _ALTURA = 400;
    private static final int _INCREMENTO_X = 131;
    private static final int _INCREMENTO_Y = 131;
    private static final String _TABULEIRO = "C:\\Users\\marco\\GitHub\\Projetos\\jogo-da-velha\\src\\main\\java\\bilotta\\images\\tabuleiroColorido400x400.png";
    
    private CampoTabuleiro campoTabuleiro;
    private int posicaoXTabuleiro = 140;
    private int posicaoYTabuleiro = 25;
    private int posicaoInicialDoCampoEmX = 150;
    private int posicaoInicialDoCampoEmY = 35;
    
    public Tabuleiro(){
        definirImagemFundo();
        definirTamanho();
    } 
    
    private void definirTamanho(){
        this.setBounds(posicaoXTabuleiro, posicaoYTabuleiro, _LARGURA, _ALTURA);
    }    
    
    public void definirImagemFundo(){
        Icon imagemFundo = new ImageIcon(_TABULEIRO);
        this.setIcon(imagemFundo);
    }
    
    public List<CampoTabuleiro> criarCamposTabuleiro(){
        List<CampoTabuleiro> camposTabuleiro = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            if ((i == 3) || (i == 6)){
                CampoTabuleiro campoTabuleiro = new CampoTabuleiro();
                posicaoInicialDoCampoEmX = 150;
                posicaoInicialDoCampoEmY += _INCREMENTO_Y;
                campoTabuleiro.setBounds(posicaoInicialDoCampoEmX, posicaoInicialDoCampoEmY, CampoTabuleiro._LARGURA, CampoTabuleiro._ALTURA);
                posicaoInicialDoCampoEmX += _INCREMENTO_X;
                Border borda = new LineBorder(Color.RED, 2);
                campoTabuleiro.setBorder(borda);
                camposTabuleiro.add(campoTabuleiro);
            } else {
                CampoTabuleiro campoTabuleiro = new CampoTabuleiro();
                campoTabuleiro.setBounds(posicaoInicialDoCampoEmX, posicaoInicialDoCampoEmY, CampoTabuleiro._LARGURA, CampoTabuleiro._ALTURA);
                posicaoInicialDoCampoEmX += _INCREMENTO_X;
                Border borda = new LineBorder(Color.RED, 2);
                campoTabuleiro.setBorder(borda);
                camposTabuleiro.add(campoTabuleiro);
              }
        }
        return camposTabuleiro;
    }
}
