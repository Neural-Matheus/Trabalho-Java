package Teste;

public class Corretor extends Pessoa {

    private String creci;

    // Construtor com todos os parâmetros de Pessoa e o creci
    public Corretor(String nome, String cpf, Endereco endereco, String celular, String creci) {
        super(nome, cpf, endereco, celular);
        this.creci = creci;
    }

    // Método para obter o CRECI
    public String getCreci() {
        return creci;
    }

    // Método para definir o CRECI
    public void setCreci(String creci) {
        this.creci = creci;
    }

    // Sobrescreve o método toString da classe Pessoa
    @Override
    public String toString() {
        return super.toString() + ", CRECI: " + creci;
    }
}