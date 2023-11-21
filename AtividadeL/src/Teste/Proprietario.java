package Teste;

public class Proprietario extends Pessoa {

    private String pix;

    // Construtor com todos os parâmetros de Pessoa e o pix
    public Proprietario(String nome, String cpf, Endereco endereco, String celular, String pix) {
        super(nome, cpf, endereco, celular);
        this.pix = pix;
    }

    // Método para obter o PIX
    public String getPix() {
        return pix;
    }

    // Método para definir o PIX
    public void setPix(String pix) {
        this.pix = pix;
    }

    // Sobrescreve o método toString da classe Pessoa
    @Override
    public String toString() {
        return super.toString() + ", PIX: " + pix;
    }
}
