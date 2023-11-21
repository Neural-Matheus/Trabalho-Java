package Teste;

public class TipoImovel {

    private String tipo;

    // Construtor com o tipo (terreno, casa, apartamento, comercio)
    public TipoImovel(String tipo) {
        this.tipo = tipo;
    }

    // Método para obter o tipo do imóvel
    public String getTipo() {
        return tipo;
    }

    // Sobrescreve o método toString
    @Override
    public String toString() {
        return "Tipo de Imovel: " + tipo;
    }
}