package bilotta.jogodavelha;

/**
 * date - 16/09/2022
 * @author - Marco Aurélio Bilotta e Luiz Eduardo Bilotta
 */

public class Jogador {
    private String nome;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nomeRecebido){
        this.nome = nomeRecebido;
    }
    
}
