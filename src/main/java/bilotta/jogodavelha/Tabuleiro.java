package bilotta.jogodavelha;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    
    private static final int LARGURA = 400;
    private static final int ALTURA = 400;
    private static final int INCREMENTO_X = 131;
    private static final int INCREMENTO_Y = 131;
    private static final String TABULEIRO = "C:\\Users\\marco\\GitHub\\Projetos\\jogo-da-velha\\src\\main\\java\\bilotta\\images\\tabuleiroColorido400x400.png";
    private final int POSICAO_X_TABULEIRO = 140;
    private final int POSICAO_Y_TABULEIRO = 25;
    
    private final int posicaoInicialDoCampoEmX = 150;
    private final int posicaoInicialDoCampoEmY = 35;
    
    public Tabuleiro(){
        this.definirImagemFundo();
        this.definirTamanho();
    } 
    
    private void definirTamanho(){
        this.setBounds(POSICAO_X_TABULEIRO, POSICAO_Y_TABULEIRO, LARGURA, ALTURA);
    }    
    
    public void definirImagemFundo(){
        Icon imagemFundo = new ImageIcon(TABULEIRO);
        this.setIcon(imagemFundo);
    }
    
    public List<CampoTabuleiro> criarCamposTabuleiro(){
        List<CampoTabuleiro> camposTabuleiro = new ArrayList<>();
        int posicaoDoCampoEmX = posicaoInicialDoCampoEmX;
        int posicaoDoCampoEmY = posicaoInicialDoCampoEmY;
        for (int i = 0; i < 9; i++){
            if ((i == 3) || (i == 6)){
                posicaoDoCampoEmY += INCREMENTO_Y;
                posicaoDoCampoEmX = posicaoInicialDoCampoEmX;
            } 
            CampoTabuleiro campoTabuleiro = new CampoTabuleiro();
            campoTabuleiro.setBounds(posicaoDoCampoEmX, posicaoDoCampoEmY, CampoTabuleiro._LARGURA, CampoTabuleiro._ALTURA);
            campoTabuleiro.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent arg0){
                    System.out.println("CLICOU!");
                }
            });
            posicaoDoCampoEmX += INCREMENTO_X;
            Border borda = new LineBorder(Color.RED, 2);
            campoTabuleiro.setBorder(borda);
            camposTabuleiro.add(campoTabuleiro);
              
        }
        return camposTabuleiro;
    }
}
