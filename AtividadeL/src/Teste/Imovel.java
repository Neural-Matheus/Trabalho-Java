package Teste;

public class Imovel implements Comparable<Imovel> {

    private TipoImovel tipo;
    private Endereco endereco;
    private double area;
    private double preco;
    private Proprietario proprietario;

    // Construtor com os parâmetros do imóvel
    public Imovel(TipoImovel tipo, Endereco endereco, double area, double preco, Proprietario proprietario) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.area = area;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    // Sobrescreve o método compareTo para comparar os imóveis pelo tipo
    @Override
    public int compareTo(Imovel outroImovel) {
        return this.tipo.getTipo().compareTo(outroImovel.tipo.getTipo());
    }

    // Sobrescreve o método toString
    @Override
    public String toString() {
        return "Tipo de Imóvel: " + tipo.getTipo() +
               "\nEndereço: " + endereco +
               "\nÁrea: " + area + " metros quadrados" +
               "\nPreço: R$ " + preco +
               "\nProprietário: " + proprietario.getNome();
    }
}
