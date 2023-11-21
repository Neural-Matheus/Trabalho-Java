package Teste;

public abstract class Pessoa implements Verificavel {

    // Atributos privados
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private String celular;
    private String dataNascimento;

    // Construtor
    public Pessoa(String nome, String cpf, Endereco endereco, String celular) {
        this.nome = nome;
        // Validar o CPF antes de atribuir o valor
        if (validar(cpf)) {
            this.cpf = cpf;
        } else {
            solicitarNovo();
        }
        this.endereco = endereco;
        this.celular = celular;
    }

    // Métodos getters

    public String getNome() {
        return nome;
    }

    // Métodos da interface Verificavel

    @Override
    public boolean validar(String CPF) {
        // Aqui, você deve chamar a lógica de validação do CPF
        // utilizando a instância do seu validador
        CpfValidator cpfValidator = new CpfValidator();
        return cpfValidator.validaCPF(CPF);
    }

    @Override
    public void solicitarNovo() {
        // Lógica para solicitar um novo CPF
        System.out.println("Por favor, forneça um novo CPF para " + nome);
        // Solicite um novo CPF ao usuário e chame o método validar novamente
        // Implemente a lógica real para obter um novo CPF
        String novoCpf = "NovoCPF";  // Substitua isso pela lógica real
        if (validar(novoCpf)) {
            this.cpf = novoCpf;
        } else {
            solicitarNovo();  // Chama novamente se o CPF não for válido
        }
    }
}