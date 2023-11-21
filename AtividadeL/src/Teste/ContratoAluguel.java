package Teste;

public class ContratoAluguel<T> {

    private Imovel imovel;
    private Corretor corretor;
    private Cliente cliente;
    private T tempo;
    private double valor;

    // Construtor
    public ContratoAluguel(Imovel imovel, Corretor corretor, Cliente cliente, T tempo, double valor) {
        this.imovel = imovel;
        this.corretor = corretor;
        this.cliente = cliente;
        this.tempo = tempo;
        this.valor = valor;
    }

    // Método para calcular a comissão do corretor (10% do valor do aluguel)
    public double calcularComissao() {
        return 0.1 * valor;
    }

    // Sobrescreve o método toString
    @Override
    public String toString() {
        return "Contrato de Aluguel:" +
               "\nImóvel: " + imovel +
               "\nCorretor: " + corretor +
               "\nCliente: " + cliente +
               "\nDuração do Contrato: " + tempo +
               "\nValor do Aluguel: R$ " + valor +
               "\nComissão do Corretor: R$ " + calcularComissao();
    }
}
