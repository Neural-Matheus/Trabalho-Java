package Teste;

public class Endereco {

    // Atributos
	@SuppressWarnings("unused")
    private String rua;
	@SuppressWarnings("unused")
    private int numero;
	@SuppressWarnings("unused")
    private String bairro;
    @SuppressWarnings("unused")
	private String cidade;
    private String cep;

    // Construtor para endereço completo
    public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    // Construtor para endereço com todos os parâmetros, exceto o CEP
    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        // O CEP não é passado como parâmetro, você pode inicializá-lo como desejado ou deixá-lo como null
        this.cep = null;  // Ou forneça um valor padrão, se necessário
    }

    // Métodos getters e setters podem ser adicionados conforme necessário

    // Exemplo de getter para o CEP
    public String getCep() {
        return cep;
    }

    // Exemplo de setter para o CEP
    public void setCep(String cep) {
        this.cep = cep;
    }
}