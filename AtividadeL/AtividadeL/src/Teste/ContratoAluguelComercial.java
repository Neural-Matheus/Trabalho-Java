package Teste;

public class ContratoAluguelComercial extends ContratoAluguel<String> {

    private String razaoSocial;
    private String cnpj;

    // Construtor
    public ContratoAluguelComercial(
            Imovel imovel, Corretor corretor, Cliente cliente, String tempo, double valor,
            String razaoSocial, String cnpj) {
        super(imovel, corretor, cliente, tempo, valor);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    // Sobrescreve o método toString
    @Override
    public String toString() {
        return super.toString() +
               "\nRazão Social: " + razaoSocial +
               "\nCNPJ: " + cnpj;
    }
}
