package Teste;

public class Cliente extends Pessoa {

    private int pontuacao;

    // Construtor com todos os parâmetros de Pessoa e a pontuação
    public Cliente(String nome, String cpf, Endereco endereco, String celular, int pontuacao) {
        super(nome, cpf, endereco, celular);
        this.pontuacao = pontuacao;
    }

    // Método para obter a pontuação
    public int getPontuacao() {
        return pontuacao;
    }

    // Método para definir a pontuação
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Sobrescreve o método toString da classe Pessoa
    @Override
    public String toString() {
        return super.toString() + ", Pontuação: " + pontuacao;
    }
}
