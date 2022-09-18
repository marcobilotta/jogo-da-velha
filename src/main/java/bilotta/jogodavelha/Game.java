package bilotta.jogodavelha;

import java.lang.reflect.Constructor;
import javax.swing.JOptionPane;

/**
 * @date - 16/09/2022
 * @author - Marco Aurélio Bilotta
 */

public class Game {
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    
    public Jogador getJogador1(){
        return this.jogador1;
    }
    
    public Jogador getJogador2(){
        return this.jogador2;
    }
    
    public Tabuleiro getTabuleiro(){
        return this.tabuleiro;
    }
    
    public void setTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    public Game() {
        this.NomearJogadores();
        tabuleiro = new Tabuleiro();
    }
    
    private void NomearJogadores(){
        String nomeJogador1 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 1", "NOME JOGADOR 1", 3);
        jogador1 = new Jogador(nomeJogador1);
        String nomeJogador2 = JOptionPane.showInputDialog(null, "Digite o nome do jogador 2", "NOME JOGADOR 2", 3);
        jogador2 = new Jogador(nomeJogador2);
    }
    
    
}
